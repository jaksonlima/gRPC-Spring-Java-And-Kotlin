package com.grpc1.gRPC1.user;

import br.com.UserRequest;
import br.com.UserResponse;
import br.com.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@GrpcService
public class UserDefault extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void findUser(final UserRequest request,
                         final StreamObserver<UserResponse> responseObserver) {

        final var build = UserResponse.newBuilder()
                .setMessage(request.getMessage() + UUID.randomUUID())
                .build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
