package org.github.winter.agent.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    /**
     * 配置Docket(扫描的包路径)
     *
     * @return
     */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("org.github.winter.agent.manager"))
                .paths(PathSelectors.any()).build();
    }
    
    /**
     * 配置swagger api信息
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Agent-Manager API文档")
                .description("Agent-Manager 自动生成的Swagger2 API文档")
                .termsOfServiceUrl("")
                .contact(new Contact("ouy&stone-98","","670569467@qq.com"))
                .version("1.0.0")
                .build();
    }

}
