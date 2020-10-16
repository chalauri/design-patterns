package ge.edu.sangu.observer.observable;

import java.util.HashSet;
import java.util.Set;

import ge.edu.sangu.observer.interfaces.Notification;

public class SportNews implements News{

    private Set<Notification> observers;

    public SportNews(){
        this.observers = new HashSet<>();
    }

    public void addObserver(Notification observer) {
        observers.add(observer);
    }

    public void removeObserver(Notification observer) {
        observers.remove(observer);
    }

    public void setNews(String news){
        observers.forEach(observer -> {
            observer.notify(news);
        });
    }
}
