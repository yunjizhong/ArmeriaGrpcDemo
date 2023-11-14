import com.linecorp.armeria.common.SessionProtocol
import com.linecorp.armeria.server.Server
import com.linecorp.armeria.server.grpc.GrpcService
import com.linecorp.armeria.server.logging.LoggingService

fun main() {
    val sb = Server.builder()
    sb.service(
        GrpcService.builder()
            .addService(HelloService())
            .build(),
        LoggingService.newDecorator()
    ).port(50051, SessionProtocol.H2C)
    val server = sb.build()
    server.start().join()
}