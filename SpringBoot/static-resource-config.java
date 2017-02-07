package com.anderson.hummingbird.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ServerConfig {

	public class FaviconConfiguration extends WebMvcConfigurerAdapter{
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry){
			registry.setOrder(Integer.MIN_VALUE);
			registry.addResourceHandler("/favicon.ico").addResourceLocations("/");			
			registry.addResourceHandler("/static/**").addResourceLocations("/");
		}
	}
}
