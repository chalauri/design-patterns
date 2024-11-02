package ge.edu.sangu.observer.interfaces;

import ge.edu.sangu.observer.model.Message;

// This is our observer interface
public interface Subscriber {

    void notifyWithDateTime(Message message);
}
