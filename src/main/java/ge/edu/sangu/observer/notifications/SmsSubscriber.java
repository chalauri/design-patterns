package ge.edu.sangu.observer.notifications;

import ge.edu.sangu.observer.interfaces.Subscriber;
import ge.edu.sangu.observer.model.Message;

public class SmsSubscriber implements Subscriber {

    @Override
    public void notify(String message) {
        System.out.println("\n");
        System.out.println("This is sms notification which you subscribed");
        System.out.println("You have new information : " + message);
        System.out.println("\n");
    }

    @Override
    public void notifyWithDateTime(Message message) {
        System.out.println("\n");
        System.out.println("This is sms notification which you subscribed");
        System.out.println("You have new information : " + message.getMessage());
        System.out.println("\n");
    }
}
