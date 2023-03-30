package ge.edu.sangu.observer.observable;

import ge.edu.sangu.observer.interfaces.Subscriber;

public interface News {

    void setNews(String news);

    void addObserver(Subscriber observer);

    void removeObserver(Subscriber observer);

}
