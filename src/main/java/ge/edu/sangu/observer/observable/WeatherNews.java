package ge.edu.sangu.observer.observable;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import ge.edu.sangu.observer.interfaces.Subscriber;
import ge.edu.sangu.observer.model.Message;

public class WeatherNews implements News {

    private final Set<Subscriber> observers;

    public WeatherNews() {
        this.observers = new HashSet<>();
    }

    @Override
    public void addObserver(Subscriber observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Subscriber observer) {
        observers.remove(observer);
    }

    @Override
    public void publishNewArticle(String news) {
        observers.forEach(observer -> observer.notifyWithDateTime(new Message(Instant.now(), news)));
    }
}
