package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	//springdoc 스웨거 설정방법
	private Info apiInfo() {
        return new Info()
                .title("Springdoc 테스트")
                .description("Springdoc을 사용한 Swagger UI 테스트")
                .version("1.0.0");
    }
	
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

	
	//springfox 스웨거 설정방법
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30)
//                .useDefaultResponseMessages(false)
//                .select()
//                /* 모든경로 설정 */
////                .apis(RequestHandlerSelectors.any())
////                .paths(PathSelectors.any())
//                /* 특정 경로 설정 */
//                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")) //1차필터
//                .paths(PathSelectors.ant("/user/**")) //2차필터
//                .build()
//                .apiInfo(apiInfo());
//    }
//    
//    // host/swagger-ui/index.html 페이지 상단 내용
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("유저서비스 제목영역")
//                .description("유저서비스 설명영역")
//                .version("1.0")
//                .build();
//    }
    
}