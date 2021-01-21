package mx.com.config

import com.google.common.base.Predicate
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import static springfox.documentation.builders.PathSelectors.*
import static com.google.common.base.Predicates.*

@Configuration
@EnableSwagger2
class SwaggerConfig {

  @Bean
  Docket campusApi() {
    new Docket(DocumentationType.SWAGGER_2)
    .groupName("Spring MVC Example")
    .apiInfo(apiInfo())
    .select()
    .paths(paths())
    .build()
    .useDefaultResponseMessages(false)
  }

  private Predicate<String> paths() {
    "Expose diferentes paths if you want configurate another versions"
    "This paths is about of paths of controllers, be carefully how to configurate"
    "regex(\"/v1/api/*.*\"), regex(\"/v2/api/*.*\")"
    return or(regex("/v1/api/*.*"))
  }

  private ApiInfo apiInfo() {
    "Information about API"
    new ApiInfoBuilder()
    .title("SPRING MVC")
    .description("API REST expose many Service")
    .version("1.0.0")
    .build()
  }
}

