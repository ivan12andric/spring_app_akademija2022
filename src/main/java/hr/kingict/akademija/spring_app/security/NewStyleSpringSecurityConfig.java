package hr.kingict.akademija.spring_app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class NewStyleSpringSecurityConfig  {

    @Bean
    public SecurityFilterChain securityChain(HttpSecurity http) throws Exception{

        http.authorizeRequests()
                .antMatchers( HttpMethod.GET,  "/api/**").hasRole("USER")
                .antMatchers( HttpMethod.POST,  "/api/**").hasRole("ADMIN");

        http.cors().disable();
        http.csrf().disable();
        http.httpBasic();
        http.formLogin();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        return http.build();
    }


    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails basicUser = User.withDefaultPasswordEncoder()
                .username("user")
                .password("pass")
                .roles("USER")
                .build();

        UserDetails adminUser = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("pass")
                .roles("ADMIN", "USER")
                .build();
        return new InMemoryUserDetailsManager(basicUser, adminUser);
    }
}
