package com.yueqian.boot_demo.config;

import java.util.Arrays;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setPrefix("/");
		r.setSuffix(".jsp");
		r.setOrder(9999);
		registry.viewResolver(r);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

	/*
	 * @Bean public MessageSource messageSource() { ResourceBundleMessageSource ms =
	 * new ResourceBundleMessageSource(); ms.setBasename("msg"); return ms; }
	 */

	@Bean
	public FilterRegistrationBean<Filter> filterRegistration() {
		FilterRegistrationBean<Filter> r = new FilterRegistrationBean<>();
		CharacterEncodingFilter f = new CharacterEncodingFilter();
		f.setEncoding("utf-8");
		r.setFilter(f);
		r.setUrlPatterns(Arrays.asList("/*"));
		System.out.println("================filterRegistration==============");
		return r;
	}
}
