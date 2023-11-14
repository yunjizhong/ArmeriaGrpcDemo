import com.example.grpc.hello.HelloRequest
import com.example.grpc.hello.HelloResponse
import com.example.grpc.hello.HelloServiceGrpcKt

class HelloService : HelloServiceGrpcKt.HelloServiceCoroutineImplBase() {
    override suspend fun hello(request: HelloRequest): HelloResponse {
        return HelloResponse.newBuilder().setMessage("Hello ${request.name}").build()
    }
}