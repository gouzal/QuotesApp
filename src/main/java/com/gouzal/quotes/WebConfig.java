package com.gouzal.quotes;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/img/**",
                "/font/**",
                "/css/**",
                "/scss/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/static/img/",
                        "classpath:/static/font/",
                        "classpath:/static/css/",
                        "classpath:/static/scss/",
                        "classpath:/static/js/");
    }
}
