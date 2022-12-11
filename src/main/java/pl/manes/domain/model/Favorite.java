package pl.manes.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@Table(name = "favorites")
@Entity
public class Favorite {

    @Id
    private UUID id;

    @JsonProperty(value = "Title")
    private String title;

    @JsonProperty(value = "Director")
    private String director;

    @JsonProperty(value = "Genre")
    private String genre;

    @JsonProperty(value = "Plot")
    private String plot;

    public Favorite() {
        this.id = UUID.randomUUID();
    }

    public Favorite(String title, String director, String genre, String plot) {
        this();
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.plot = plot;
    }
}
