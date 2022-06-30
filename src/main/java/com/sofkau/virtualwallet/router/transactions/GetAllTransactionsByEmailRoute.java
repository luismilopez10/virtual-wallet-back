package com.sofkau.virtualwallet.router.transactions;

import com.sofkau.virtualwallet.dto.TransactionsDTO;
import com.sofkau.virtualwallet.usecase.transactions.GetAllTransactionsByEmailUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GetAllTransactionsByEmailRoute {
    @Bean
    public RouterFunction<ServerResponse> getAllTransactionsByEmail(GetAllTransactionsByEmailUseCase useCase) {
        return route(GET("/api/get/transactionsemail/{email}"),
                request -> ServerResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromProducer(useCase.apply(request.pathVariable("email")), TransactionsDTO.class)));
    }
}
