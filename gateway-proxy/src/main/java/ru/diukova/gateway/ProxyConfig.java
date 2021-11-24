package ru.diukova.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;


//@Configuration
class ProxyConfig {

    @Bean
    RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("email_route",
                        route -> route.path("/email/**")
                                .and()
                                .method(HttpMethod.GET)
                                .uri("lb://email-sender"))
                .route("sms_route",
                        route -> route.path("/sms/**")
                                .and()
                                .method(HttpMethod.GET)
                                .uri("lb://sms-sender"))
                .route("push_route",
                        route -> route.path("/push/**")
                                .and()
                                .method(HttpMethod.GET)
                                .uri("lb://push-sender"))
                .route("message_sender_route",
                        route -> route.path("/send/**")
                                .and()
                                .method(HttpMethod.GET)
                                .filters(filter -> filter.stripPrefix(1)
                                )
                                .uri("lb://message-sender"))
                .build();
    }
}
