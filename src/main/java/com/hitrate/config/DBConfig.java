package com.hitrate.config;

import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import com.hitrate.entity.Hitrate;

@Configuration
@EnableTransactionManagement
public class DBConfig {
	@Value("${db.driver}") String dbDriver;
	@Value("${db.url}") String dbUrl;
	@Value("${db.username}") String dbUsername;
	@Value("${db.password}") String dbPassword;
	  
	@Bean
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate(sessionFactory());
	}

	@Bean
	public SessionFactory sessionFactory() {
		return new LocalSessionFactoryBuilder(getDataSource()).addAnnotatedClasses(Hitrate.class).buildSessionFactory();
	}

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(dbDriver);
		dataSource.setUrl(dbUrl);
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);
//		dataSource.setUrl("jdbc:mysql://us-cdbr-iron-east-03.cleardb.net/heroku_5f297a3ec8aa0c9");
//		dataSource.setUsername("b1c67d63499810");
//		dataSource.setPassword("5ce77e92");
//		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://localhost:5432/hitratereport");
//		dataSource.setUsername("mandyyan");
//		dataSource.setPassword("");
//		dataSource.setUrl("jdbc:postgresql://ec2-23-21-96-70.compute-1.amazonaws.com:5432/da69r1m274m8g2");
//		dataSource.setUsername("wylxunytndnrxt");
//		dataSource.setPassword("c7939e79f9e4f455ca403f491b34ffea75aaa2ca2be676cbf3588e67c2356b5c");
		return dataSource;
	}

	@Bean
	public HibernateTransactionManager hibTransMan() {
		return new HibernateTransactionManager(sessionFactory());
	}
}
