package service;

import model.types.YandereCharacter;
import repository.YandereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YandereService {
    @Autowired
    private YandereRepository yandereRepository;
    public YandereCharacter saveYandere(YandereCharacter yandere) {
        return yandereRepository.save(yandere);
    }
    public YandereCharacter findById(Long id) {
        return yandereRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        yandereRepository.deleteById(id);
    }
}