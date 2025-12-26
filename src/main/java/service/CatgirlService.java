package service;

import model.types.CatgirlCharacter;
import application.repository.CatGirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatgirlService {
    
    @Autowired
    private CatGirlRepository catgirlRepository;
    public CatgirlCharacter save(CatgirlCharacter catgirl) {
        return catgirlRepository.save(catgirl);
    }
    public CatgirlCharacter findById(Long id) {
        return catgirlRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        catgirlRepository.deleteById(id);
    }
}