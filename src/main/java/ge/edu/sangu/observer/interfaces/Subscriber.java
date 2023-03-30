package ge.edu.sangu.observer.interfaces;

import ge.edu.sangu.observer.model.Message;

public interface Subscriber {

    void notify(String message);

    void notifyWithDateTime(Message message);
}
