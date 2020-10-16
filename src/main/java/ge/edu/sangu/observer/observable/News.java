package ge.edu.sangu.observer.observable;

import ge.edu.sangu.observer.interfaces.Notification;

public interface News {

    void setNews(String news);

    void addObserver(Notification observer);

    void removeObserver(Notification observer);

}
