package com.example.TekarchDataStoreMS.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow all origins for the /flights endpoint (or globally for all endpoints)
                registry.addMapping("/flights")  // Apply CORS only for /flights endpoint
                        .allowedOrigins("*")  // Allow all origins (replace "*" with specific URLs for better security)
                        .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allow specific HTTP methods
                        .allowedHeaders("*")  // Allow all headers
                        .allowCredentials(true);  // Allow credentials (cookies, etc.)

                // You can also apply global CORS to all endpoints:
                // registry.addMapping("/**")
                //     .allowedOrigins("*")
                //     .allowedMethods("GET", "POST", "PUT", "DELETE")
                //     .allowedHeaders("*")
                //     .allowCredentials(true);
            }
        };
    }
}