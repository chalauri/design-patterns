package ge.edu.sangu.observer.observable;

import ge.edu.sangu.observer.interfaces.Subscriber;

// This is publisher interface
public interface News {

    void publishNewArticle(String news);

    void addObserver(Subscriber observer);

    void removeObserver(Subscriber observer);
}
