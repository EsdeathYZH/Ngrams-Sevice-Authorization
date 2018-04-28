package com.esdeath.ngramssevice.security;

import com.esdeath.ngramssevice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    //完成自定义认证实体注入
    @Bean
    UserDetailsService userService()
    {
        return new UserService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/register")
        .permitAll()
        .anyRequest().authenticated()//所有请求必须登陆后访问
        .and()
            .formLogin()
            .loginPage("/login")
            .failureUrl("/login?error")
            .permitAll()//登录界面，错误界面可以直接访问
        .and()
        .logout()
        .permitAll();//注销请求可直接访问
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth){
        try {
            auth
                    .inMemoryAuthentication()
                    .withUser("user")
                    .password("123456")
                    .roles("USER")
                    .and()
                    .withUser("admin")
                    .password("admin")
                    .roles("ADMIN", "USER");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new MyPasswordEncoder();
    }
    //配置全局设置
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //设置UserDetailsService以及密码规则
        auth.userDetailsService(userService()).passwordEncoder(passwordEncoder());
    }
}
