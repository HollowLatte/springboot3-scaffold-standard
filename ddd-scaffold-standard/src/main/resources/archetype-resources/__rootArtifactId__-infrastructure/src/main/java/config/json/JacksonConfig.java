#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config.json;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer customizer() {
        return builder -> {
            // 注册自定义的Module
            SimpleModule jsLongToStringModule = new SimpleModule("JsLongToStringModule");
            jsLongToStringModule.addSerializer(Long.TYPE, JsLongToStringSerializer.INSTANCE);
            jsLongToStringModule.addSerializer(Long.class, JsLongToStringSerializer.INSTANCE);
            builder.modulesToInstall(jsLongToStringModule);
        };
    }

}
