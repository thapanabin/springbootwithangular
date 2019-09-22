//package com.bookservice;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//	
//	@Bean
//	public WebMvcConfigurer corsConfigure() {
//		return new WebMvcConfigurer() {
//			
//			public void addCorsMapping(CorsRegistry registry) {
//				registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE").allowedHeaders("*").allowedOrigins("http://localhost:4200");
//			}
//		};
//	}
//}
