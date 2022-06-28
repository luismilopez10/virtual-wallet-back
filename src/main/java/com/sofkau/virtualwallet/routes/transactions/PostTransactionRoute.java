package com.sofkau.virtualwallet.routes.transactions;

import com.sofkau.virtualwallet.dto.TransactionsDTO;
import com.sofkau.virtualwallet.usecase.transactions.PostTrasactionUseCase;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class PostTransactionRoute {

//    public RouterFunction<ServerResponse> postTransaction (PostTrasactionUseCase useCase) {
//        return route(POST("transaction").and(accept(MediaType.APPLICATION_JSON)),
//                request -> request.bodyToMono(TransactionsDTO.class).flatMap())
//    }
}