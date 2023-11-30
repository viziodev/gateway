package com.wane.gateway.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    @Bean
    CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.setAllowCredentials(true);
        corsConfig.setAllowedOriginPatterns(Arrays.asList("http://127.0.0.1:*", "http://localhost:*"));
        corsConfig.setMaxAge(8000L);
        corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        corsConfig.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization", "X-ApplicationId",
                "X-User-BuildingId", "X-CSRF-TOKEN"));

        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", corsConfig);
          //source.registerCorsConfiguration("/v2/api-docs", corsConfig);
        return new CorsWebFilter(source);
    }
}

