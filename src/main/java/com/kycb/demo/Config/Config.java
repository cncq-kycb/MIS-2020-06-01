package com.kycb.demo.Config;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {

	public class LoginSuccessHandler implements AuthenticationSuccessHandler {

		@Override
		public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
				Authentication authentication) throws IOException {
			Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
			// 获取权限,跳转
			if (roles.contains("ROLE_ADMIN")) {
				response.sendRedirect("/admin/index.html");
				return;
			} else if (roles.contains("ROLE_USER")) {
				response.sendRedirect("/user/index.html");
				return;
			} else {
				response.sendRedirect("/403");
			}
		}
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/register.html").permitAll() // 不需要登录就可以访问
				.antMatchers("/assets/**", "/logo/**").permitAll() // 引用静态资源
				.antMatchers("/user/**").hasAnyAuthority("ROLE_USER") // 需要具有ROLE_USER角色才能访问
				.antMatchers("/admin/**").hasAnyAuthority("ROLE_ADMIN") // 需要具有ROLE_ADMIN角色才能访问
				.anyRequest().authenticated() // 设置权限验证
				.and().formLogin().loginPage("/login.html").permitAll() // 设置登录页面
				.loginProcessingUrl("/authentication/login").successHandler(new LoginSuccessHandler()) // 自定义登录路径
				.and().logout().permitAll() // 设置登出页面
				.logoutUrl("/authentication/logout").logoutSuccessUrl("/login.html") // 自定义登出路径
				.and().csrf().disable();
	}

}
