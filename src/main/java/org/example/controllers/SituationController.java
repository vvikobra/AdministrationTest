package org.example.controllers;

import org.example.models.Situation;
import org.example.repository.SituationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/situation")
public class SituationController {

    private final SituationRepository situationRepository = new SituationRepository();

    @GetMapping
    public Situation getSituation() {
        return situationRepository.getRandomSituation();
    }

    @GetMapping("/{id}")
    public Object getSituationById(@PathVariable("id") String id) {
        try {
            return situationRepository.getSituationById(id);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
