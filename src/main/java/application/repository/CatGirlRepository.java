package application.repository;
import model.types.CatgirlCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatGirlRepository extends JpaRepository<CatgirlCharacter, Long> {
    
}