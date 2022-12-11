package pl.manes.configuration.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MovieDataFinderRestTemplateBean {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
