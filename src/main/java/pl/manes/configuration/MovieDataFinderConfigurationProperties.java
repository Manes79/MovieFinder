package pl.manes.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "pl.manes")
public class MovieDataFinderConfigurationProperties {

    private MovieBase movieBase = new MovieBase();

    @Data
    public static class MovieBase {
        private String apiKey;
        private String url;
    }

}
