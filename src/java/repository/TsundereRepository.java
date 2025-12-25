package repository;
import model.types.TsundereCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TsundereRepository extends JpaRepository<TsundereCharacter, Long> {
    
}