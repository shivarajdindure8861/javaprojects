package com.shivu.webflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class WebFluxConfig {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(OtherItemHandler handler) {
        return RouterFunctions.route()
                .GET("/other/", handler::read)
                .POST("/other/", accept(MediaType.APPLICATION_JSON), handler::create)
                .PUT("/other/", handler::update)
                .DELETE("/other/", handler::delete)
                .build();
    }
}
