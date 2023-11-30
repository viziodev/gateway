package com.wane.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {
    /*
        uri destination
        predicate  condition a satisfaire pour acheminer la requete
        Filtre : apporte des Modificatins de la requete
     */
    @Bean
    public RouteLocator staticRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("agent-service", r -> r.path("/api/v1/agent/**")
                        .uri("http://127.0.0.1:9093"))
                .build();

    }


}

