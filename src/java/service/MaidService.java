package service;

import model.types.MaidCharacter;
import application.repository.MaidCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaidService {
    @Autowired
    private MaidCharacterRepository maidRepository;
    public MaidCharacter save(MaidCharacter maid) {
        return maidRepository.save(maid);
    }
    public MaidCharacter findById(Long id) {
        return maidRepository.findById(id).orElse(null);
    }
    public void deleteById(Long id) {
        maidRepository.deleteById(id);
    }
}