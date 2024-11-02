package ge.edu.sangu.observer.notifications;

import ge.edu.sangu.observer.interfaces.Subscriber;
import ge.edu.sangu.observer.model.Message;

public class PhoneCallSubscriber implements Subscriber {

    @Override
    public void notifyWithDateTime(Message message) {
        System.out.println("This is phone call notification which you subscribed");
        System.out.println("You have new information : " + message.getMessage() + ", time = " + message.getMessageDateTime());
        System.out.println("\n");
    }
}
