package com.kycb.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/login.html", "/register.html").permitAll() // 不需要登录就可以访问
				.antMatchers("/user/**").hasAnyRole("ROLE_USER") // 需要具有ROLE_USER角色才能访问
				.antMatchers("/admin/**").hasAnyRole("ROLE_ADMIN") // 需要具有ROLE_ADMIN角色才能访问
				.anyRequest().authenticated().and().formLogin().loginPage("/login.html").permitAll()// 设置登录页面
				.and().logout().permitAll() // 设置登出页面
		;
	}

}
