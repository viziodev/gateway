package com.wane.gateway.config;
import org.springframework.stereotype.Component;
import org.springframework.http.server.reactive.ServerHttpRequest;


import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {
    //Routes open
    public static final List<String> openApiEndpoints = List.of();
    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));
}
