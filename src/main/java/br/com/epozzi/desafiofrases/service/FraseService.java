package br.com.epozzi.desafiofrases.service;

import br.com.epozzi.desafiofrases.dto.FraseDTO;
import br.com.epozzi.desafiofrases.model.FraseED;
import br.com.epozzi.desafiofrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class FraseService {

    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO buscaFrase() {
        long fraseCount = fraseRepository.count();
        Random random = new Random();
        int randomNumber = random.nextInt((int) fraseCount);
        Optional<FraseED> fraseED = fraseRepository.findById((long) randomNumber);
        return fraseED.map(FraseDTO::toDTO).orElse(null);
    }
}
