package pl.manes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
@Builder
public class RatingDto {

    @JsonProperty(value = "Source")
    private String source;

    @JsonProperty(value = "Value")
    private String value;

    @Override
    public String toString() {
        return source + '\'' + value + '\'';
    }
}
