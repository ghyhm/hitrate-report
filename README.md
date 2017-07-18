# hitrate-report
## Application configuration
Application configuration files are defined in hitrate-report/src/main/resources/properties.

application-dev.properties and application-prd.properties correspond to development and production environments respectively.

When starting up server, it looks at the environment variable to determine which properties file to use.

<code>-Dspring.profiles.active=dev</code>

## Database
MySQL is used in the application.

There are 2 tables: hitrate and hitrate_tmp.
The scripts are defined in src/main/resources/db/migration.

I intended to use <a href="https://flywaydb.org/getstarted/firststeps/gradle">flywaydb</a>.

Below is defined in build.gradle
<code>

    buildscript {
        repositories {
            mavenCentral()
        }
        dependencies {
            classpath 'mysql:mysql-connector-java:5.1.31'
        }
    }
    plugins {
        id "org.flywaydb.flyway" version "4.2.0"
    }
    flyway {
        url = 'jdbc:mysql://localhost:3306/hitratereport'
        user = 'root'
    }
</code>

This helps to keep all database changes in a place.

When there are new migrations, we can run below command to apply the changes to database.

<code>gradle flywayMigrate -i</code>

Note: Now the database URL is hardcoded in build.gradle. It needs to be configure to run for dev and prd environments.

## Deploy with Heroku Cli
1. Install Heroku Cli

<code>heroku plugins:install heroku-cli-deploy</code>

2. Build war file

<code>gradle stage</code>

3. Set Heroku context root

<code>heroku config:set WEBAPP_RUNNER_OPTS="--path /hitrate-report"</code>

4. Deploy to Heroku (My heroku server is marvelous-kings-canyon-80793. You can change to your own.) 

<code>heroku war:deploy build/libs/hitrate-report-1.war --app marvelous-kings-canyon-80793</code>

## Application on Heroku
<a href="https://marvelous-kings-canyon-80793.herokuapp.com/hitrate-report" target="_blank">Hit Rate Report</a>

## Checkstyle for code analysis
Checkstyle is used for static code analysis. This is to check coding standard.

<code>gradle check</code>

## Cucumber for BDD
Cucumber is setup for BDD.

<code>gradle cucumber</code>

## Integration with Circle CI
The project is integrated with Circle CI. Any check-in to github will run circle ci automatically.

We can define the task to run in circle CI, like running all cucumber tests or even add the command to deploy to Heroku.

<a href="https://circleci.com/gh/ghyhm/hitrate-report" target="_blank">Hit Rate Report Circle CI</a>

## Assumptions and further enhancements
Due to limited implementation time, some of the functions are not implmeneted yet. However, I will try to show the idea that I want to do.

1. Login

<code>com.hitrate.interceptor.AuthenticationInterceptor</code> is used. The idea is to make sure every page access needs to check if the user is authenticated. The actual checking logic is not implemented yet.  So now you can type in any user name and password to login.

2. Search

User needs to type the Visit Date string in YYYY-MM-DD format (e.g. 2016-01-06).

A better way is to use <a href="https://jqueryui.com/datepicker/" target="_blank">datepicker</a>.

We can add search on website to know when a particular website have high hit rates.

Currently it is fixed to those top 5. We can make it dynamic for user to choose showing top 5 or top 10 for example.

3. Cucumber Test

The way for writting cucumber tests is shown in the feature file hitrate-report/src/test/resources/searchHitrate.feature.
However, the actual implementation for each test steps are not done yet.
