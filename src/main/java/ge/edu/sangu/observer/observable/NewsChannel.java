package ge.edu.sangu.observer.observable;

import java.util.HashSet;
import java.util.Set;

import ge.edu.sangu.observer.interfaces.Notification;

public class NewsChannel {

    private Set<Notification> observers;

    public void addObserver(Notification observer) {
       if(observers == null){
           observers = new HashSet<>();
       }

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
