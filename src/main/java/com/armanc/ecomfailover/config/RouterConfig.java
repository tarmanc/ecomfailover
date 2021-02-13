package com.armanc.ecomfailover.config;

import com.armanc.ecomfailover.ResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction inventoryRoute(ResponseHandler responseHandler) {
        return route(GET("/test-failover").and(accept(MediaType.TEXT_PLAIN)),
                responseHandler::listInventory);
    }

}
