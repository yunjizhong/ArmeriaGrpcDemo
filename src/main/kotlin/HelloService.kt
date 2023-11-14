import com.example.grpc.hello.HelloRequest
import com.example.grpc.hello.HelloResponse
import com.example.grpc.hello.HelloServiceGrpcKt
import kotlinx.coroutines.delay

class HelloService : HelloServiceGrpcKt.HelloServiceCoroutineImplBase() {
    override suspend fun hello(request: HelloRequest): HelloResponse {
        delay(200)
        return HelloResponse.newBuilder().setMessage("Hello ${request.name}").build()
    }
}