package ge.edu.sangu.observer.notifications;

import ge.edu.sangu.observer.interfaces.Notification;

public class PhoneCallNotification implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("\n");
        System.out.println("This is phone call notification which you subscribed.");
        System.out.println("You have new information : " + message);
        System.out.println("\n");
    }
}
