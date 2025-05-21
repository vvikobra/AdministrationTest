package org.example.controllers;

import org.example.models.Quote;
import org.example.repository.QuoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    private final QuoteRepository quoteRepository = new QuoteRepository();

    @GetMapping
    public Quote getQuote() {
        return quoteRepository.getRandomQuote();
    }

    @GetMapping("/{id}")
    public Object getQuoteById(@PathVariable("id") String id) {
        try {
            return quoteRepository.getQuoteById(id);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
