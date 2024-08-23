package ir.freeland.spring.scopeadvance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	  public SecurityFilterChain configure(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(
	        		requests -> requests	            
	            .anyRequest().permitAll())
	        .csrf().disable();
	    return http.build();
	  }
	 

}
