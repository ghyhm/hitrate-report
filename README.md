# hitrate-report
## Deploy with Heroku Cli
1. Install Heroku Cli

<code>heroku plugins:install heroku-cli-deploy</code>

2. Build war file

<code>gradle stage</code>

3. Set Heroku context root

<code>heroku config:set WEBAPP_RUNNER_OPTS="--path hitrate-report”</code>

4. Deploy to Heroku (My heroku server is marvelous-kings-canyon-80793. You can change to your own.) 

<code>heroku war:deploy build/libs/hitrate-report-1.war --app marvelous-kings-canyon-80793</code>

## Application URL
<a href="https://marvelous-kings-canyon-80793.herokuapp.com/hitrate-report">Hit Rate Report</a>

## Checkstyle for code analysis
Checkstyle is used for static code analysis. This is to check coding standard.

## Cucumber for BDD
Cucumber is setup for BDD.
