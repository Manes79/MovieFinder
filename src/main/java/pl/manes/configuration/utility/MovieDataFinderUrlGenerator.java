package pl.manes.configuration.utility;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pl.manes.configuration.MovieDataFinderConfigurationProperties;

@Configuration
@AllArgsConstructor
@EnableConfigurationProperties(value = MovieDataFinderConfigurationProperties.class)
public class MovieDataFinderUrlGenerator {

    private final MovieDataFinderConfigurationProperties movieDataFinderConfigurationProperties;

    public String generateUrl(final String movieTitle) {

        final var properties = movieDataFinderConfigurationProperties.getMovieBase();
        return properties.getUrl().replace("{key}", properties.getApiKey()).replace("{title}", movieTitle).trim()
                .replace(" ", "_");
    }
}
