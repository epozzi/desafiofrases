package br.com.epozzi.desafiofrases.controller;

import br.com.epozzi.desafiofrases.dto.FraseDTO;
import br.com.epozzi.desafiofrases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SerieController {


    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO buscaFrase() {
        return fraseService.buscaFrase();
    }
}
