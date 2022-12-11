package pl.manes.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.manes.domain.model.Favorite;

import java.util.UUID;

@Repository
public interface MovieFinderRepository extends JpaRepository<Favorite, UUID> {

}
