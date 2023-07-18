package pe.edu.utp.seguridad.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 *
 * @author admin
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public AuthenticationManager autManager(AuthenticationConfiguration autConfig) throws Exception{
        return autConfig.getAuthenticationManager();
    }
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((auth)->auth
                .requestMatchers("/autor", "/editorial", "/libro").hasAuthority("USER")
                .requestMatchers("/autor/**", "/editorial/**", "/libro/**").hasAuthority("ADMIN")                
                .requestMatchers("/").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated())
                .formLogin((login)->login
                .loginPage("/login")
                        .permitAll()
                .failureUrl("/login?error=true"))
               .logout(withDefaults());
        return http.build();
    }
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return (web) ->
            web.ignoring()
            .requestMatchers("/js/**", "/css/**","/images/**","/assets/**");
    }
}
