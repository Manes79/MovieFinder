package pl.manes.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.manes.configuration.utility.MovieDataFinderUrlGenerator;
import pl.manes.domain.model.Favorite;
import pl.manes.domain.repository.MovieFinderRepository;
import pl.manes.dto.MovieDto;
import pl.manes.dto.RatingDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieDataFinderUrlGenerator movieDataFinderUrlGenerator;
    private final RestTemplate restTemplate;
    private final MovieFinderRepository movieFinderRepository;

    @Transactional
    public ResponseEntity<MovieDto> findMovie(final String movieTitle) {

        final var response = restTemplate.getForEntity(movieDataFinderUrlGenerator.generateUrl(movieTitle), MovieDto.class);
        final var movieDto = response.getBody();

        if (movieDto.getResponse().equalsIgnoreCase("FALSE"))
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(movieDto);
    }

    @Transactional
    public List<Favorite> getAllFavoritesMovies() {
        return movieFinderRepository.findAll();
    }

    @Transactional
    public Favorite addMovieToFavorite(Favorite favoriteRequest) {

        Favorite favorite = new Favorite();
        favorite.setTitle(favoriteRequest.getTitle());
        favorite.setDirector(favoriteRequest.getDirector());
        favorite.setGenre(favoriteRequest.getGenre());
        favorite.setPlot(favoriteRequest.getPlot());

        return movieFinderRepository.save(favorite);
    }
}
