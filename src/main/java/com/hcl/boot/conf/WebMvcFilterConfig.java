package com.hcl.boot.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hcl.boot.filter.RequestFilter;

@Configuration
public class WebMvcFilterConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RequestFilter()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
