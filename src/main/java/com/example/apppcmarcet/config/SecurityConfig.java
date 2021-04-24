package com.example.apppcmarcet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("superAdmin").password(password().encode("superAdmin")).roles("SUPER_ADMIN").authorities("READ_ALL_PRODUCT", "READ_ONE_PRODUCT", "DELETE_PRODUCT", "ADD_PRODUCT", "EDIT_PRODUCT")
                .and()
                .withUser("Moderator").password(password().encode("moderator")).roles("MODERATOR").authorities("ADD_PRODUCT", "EDIT_PRODUCT")
                .and()
                .withUser("operator").password(password().encode("operator")).roles("OPERATOR").authorities("READ_ALL_PRODUCT", "READ_ONE_PRODUCT");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.PUT, "/api/product/**").hasAuthority("EDIT_PRODUCT")
                .antMatchers(HttpMethod.POST, "/api/product/**").hasAuthority("ADD_PRODUCT")
                .antMatchers(HttpMethod.DELETE, "/api/product/**").hasAuthority("DELETE_PRODUCT")
                .antMatchers(HttpMethod.GET,"/api/product/**").hasAnyAuthority("READ_ALL_PRODUCT", "READ_ONE_PRODUCT")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    PasswordEncoder password() {
        return new BCryptPasswordEncoder();
    }
}
