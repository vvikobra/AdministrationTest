package org.example.repository;

import org.example.models.Quote;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class QuoteRepository {
    private final Map<String, Quote> repository = new HashMap<>();

    public Quote getRandomQuote() {
        Random random = new Random();
        Object[] values = repository.values().toArray();
        return (Quote) values[random.nextInt(0, values.length - 1)];
    }

    public Quote getQuoteById(String id) {
        if (repository.get(id) != null) return repository.get(id);
        else throw new IllegalArgumentException("Некорретный id!");
    }

    public QuoteRepository() {
        repository.put("linus-1", new Quote(
                "linus-1",
                "Linus Torvalds",
                "Talk is cheap. Show me the code."
        ));
        repository.put("knuth-1", new Quote(
                "knuth-1",
                "Donald Knuth",
                "Premature optimization is the root of all evil."
        ));
        repository.put("grace-1", new Quote(
                "grace-1",
                "Grace Hopper",
                "The most dangerous phrase in the language is, ‘We’ve always done it this way.’"
        ));
        repository.put("self-1", new Quote(
                "self-1",
                "Ты сам",
                "Этот код красив, если не вчитываться."
        ));
        repository.put("self-2", new Quote(
                "self-2",
                "Ты сам",
                "Код не работает — значит, пора сделать чай."
        ));
    }
}
