package mx.com.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["mx.com.service.impl","mx.com.util"])
class ServiceConfig {
}
