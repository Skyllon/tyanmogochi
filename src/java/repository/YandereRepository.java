package repository;
import model.types.YandereCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YandereRepository extends JpaRepository<YandereCharacter, Long> {
    
}