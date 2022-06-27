package com.sofkau.virtualwallet.router.collaborator;

import com.sofkau.virtualwallet.dto.CollaboratorDTO;
import com.sofkau.virtualwallet.usecase.collaborator.PutCollaboratorUseCase;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class PutCollaboratorRoute {

    public RouterFunction<ServerResponse> updateCollaborator(PutCollaboratorUseCase putCollaboratorUseCase){
        return route(PUT("/api/update/collaborator").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(CollaboratorDTO.class)
                        .flatMap(collaboratorDTO -> putCollaboratorUseCase.apply(collaboratorDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
