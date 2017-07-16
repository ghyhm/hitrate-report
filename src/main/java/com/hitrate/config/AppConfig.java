package com.hitrate.config;

import org.springframework.core.io.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.hitrate.interceptor.AuthenticationInterceptor;

@Configuration
@ComponentScan("com.hitrate")
@Import(DBConfig.class)
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	AuthenticationInterceptor authenticationInterceptor() {
         return new AuthenticationInterceptor();
    }
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
	    Resource resource;
	    String activeProfile;
	     
	    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =  new PropertySourcesPlaceholderConfigurer();
	     
	    // get active profile
	    activeProfile = System.getProperty("spring.profiles.active");
	    if (activeProfile == null) {
	    	activeProfile = "prd";
	    }
	 
	    // choose different property files for different active profile
	    resource = new ClassPathResource("/properties/application-" + activeProfile + ".properties");
	     
	    // load the property file
	    propertySourcesPlaceholderConfigurer.setLocation(resource);
	     
	    return propertySourcesPlaceholderConfigurer;
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/app-resources/**").addResourceLocations("/resources/");
	}
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor()).excludePathPatterns("/login*");
    }
}
