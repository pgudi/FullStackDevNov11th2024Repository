package com.gentech.springboot_securitydemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(request ->{
                    request.requestMatchers("/home").permitAll();
                    request.requestMatchers("/user/home").hasRole("USER");
                    request.requestMatchers("/admin/home").hasRole("ADMIN");
                    request.anyRequest().authenticated();
                })
                .formLogin(formLogin -> formLogin.permitAll())
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails normalUser= User.builder()
                .username("john")
                .password("$2a$12$VV7cOI0u7Jrk1tS9inChie/mGdIuEzFX56EZBpVKBgsJcMmAoqWhm")
                .roles("USER")
                .build();

        UserDetails adminUser=User.builder()
                .username("adams")
                .password("$2a$12$ZE1bPqTPf5fGXcunBVvmOeYunPVYBSatmK1VuHudz1HkrFga9kLyi")
                .roles("ADMIN","USER")
                .build();
        return new InMemoryUserDetailsManager(normalUser, adminUser);
    }


    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
