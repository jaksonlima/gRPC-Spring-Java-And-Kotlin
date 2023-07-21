package com.grpc2.gRPC2.user


import br.com.*
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService
import java.util.*

@GrpcService
class DefaultUserGrpc : UserServiceGrpc.UserServiceImplBase() {

    override fun user(request: UserRequest?, responseObserver: StreamObserver<UserResponse>?) {
        val aName = request?.name
        val aDescription = request?.description

        val aReponse = UserResponse.newBuilder()
            .setName(aName)
            .setDescription(aDescription)
            .build();

        responseObserver?.onNext(aReponse)
        responseObserver?.onCompleted()
    }

    override fun userStreamServerSideStreamin(request: UserRequestStream?, responseObserver: StreamObserver<UserResponseStream>?) {
        for (i in 1..9) {
            Thread.sleep(5000)
            val build = UserResponseStream.newBuilder()
                .setName(request?.name)
                .setId(i.toString())
                .build()

            responseObserver?.onNext(build)
        }

        responseObserver?.onCompleted()
    }

    override fun userStreamClientSideStreaming(responseObserver: StreamObserver<UserResponseStream>?): StreamObserver<UserRequestStream> {
        return object : StreamObserver<UserRequestStream> {
            var count = 0
            var sb = StringBuffer()

            override fun onNext(value: UserRequestStream?) {
                count++
                sb.append(":").append(count)
                    .append(":").append(value?.name)
            }

            override fun onError(t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                val build = UserResponseStream.newBuilder()
                    .setName(UUID.randomUUID().toString())
                    .setId(sb.toString())
                    .build()

                responseObserver?.onNext(build)
                responseObserver?.onCompleted()
            }
        }
    }

    override fun userStreamBidirectional(responseObserver: StreamObserver<UserResponseStream>?): StreamObserver<UserRequestStream> {
        return object : StreamObserver<UserRequestStream> {
            var count = 0
            var sb = StringBuffer()

            override fun onNext(value: UserRequestStream?) {
                count++
                sb.append(":").append(count)
                    .append(":").append(value?.name)

                val build = UserResponseStream.newBuilder()
                    .setName(UUID.randomUUID().toString())
                    .setId(sb.toString())
                    .build()

                responseObserver?.onNext(build)
            }

            override fun onError(t: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun onCompleted() {
                responseObserver?.onCompleted()
            }
        }
    }
}