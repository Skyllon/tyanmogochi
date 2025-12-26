package application.repository;
import model.types.MaidCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaidCharacterRepository extends JpaRepository<MaidCharacter, Long> {
    
}