package org.example.repository;

import org.example.models.Situation;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SituationRepository {
    private final Map<String, Situation> repository = new HashMap<>();

    public Situation getRandomSituation() {
        Random random = new Random();
        Object[] values = repository.values().toArray();
        return (Situation) values[random.nextInt(0, values.length - 1)];
    }

    public Situation getSituationById(String id) {
        if (repository.get(id) != null) return repository.get(id);
        else throw new IllegalArgumentException("Некорретный id!");
    }

    public SituationRepository() {
        repository.put("slomal-prod", new Situation(
                "slomal-prod",
                "Сломал прод",
                "Если никто не заметил — это не баг, а фича."
        ));
        repository.put("deadline", new Situation(
                "deadline",
                "Дедлайн через 10 минут",
                "Коммить всё подряд. Завтра разберёмся."
        ));
        repository.put("bug-is-gone", new Situation(
                "bug-is-gone",
                "Баг исчез сам",
                "Не радуйся — он ушёл за друзьями."
        ));
        repository.put("forgot-git-push", new Situation(
                "forgot-git-push",
                "Забыл сделать git push",
                "Притворись, что это философский эксперимент."
        ));
        repository.put("ide-freeze", new Situation(
                "ide-freeze",
                "IDE зависла на сохранении",
                "Открой окно, подыши, перезапусти IDE. Это не ты виноват."
        ));
        repository.put("friday-evening", new Situation(
                "friday-evening",
                "Пятница, 17:59",
                "Ничего не трогай. Просто уходи."
        ));
    }
}
