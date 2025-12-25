package service;

import model.types.TsundereCharacter;
import repository.MaidCharacterRepository;
import repository.TsundereRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TsundereService {
    @Autowired
    private TsundereRepository tsundereRepository;
    public TsundereCharacter save(TsundereCharacter tsundere) {
        return tsundereRepository.save(tsundere);
    }
    public TsundereCharacter findById(Long id) {
        return tsundereRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        tsundereRepository.deleteById(id);
    }
}