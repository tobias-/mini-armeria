import com.linecorp.armeria.client.WebClient
import com.linecorp.armeria.client.retry.RetryRule
import com.linecorp.armeria.client.retry.RetryingClient
import com.linecorp.armeria.common.logging.LogLevel
import com.linecorp.armeria.server.logging.LoggingService

fun main() {
    LoggingService.builder()
        .failureResponseLogLevel(LogLevel.INFO)
        .successfulResponseLogLevel(LogLevel.TRACE)
        .responseCauseSanitizer { _, _ ->
            null
        }
        .newDecorator()
}