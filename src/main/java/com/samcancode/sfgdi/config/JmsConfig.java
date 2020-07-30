package com.samcancode.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.samcancode.sfgdi.examplebeans.JmsDataSource;

@Configuration
public class JmsConfig {
	
	@Value("${guru.jms.username}")
	String user;
	
	@Value("${guru.jms.password}")
	String password;

	@Value("${guru.jms.url}")
	String url;
	
	@Bean
	public JmsDataSource jmsDataSource() {
		JmsDataSource fakeDataSource = new JmsDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		
		return fakeDataSource;
	}
	
}
