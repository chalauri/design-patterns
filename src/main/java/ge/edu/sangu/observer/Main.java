package ge.edu.sangu.observer;

import ge.edu.sangu.observer.interfaces.Notification;
import ge.edu.sangu.observer.notifications.EmailNotification;
import ge.edu.sangu.observer.notifications.PhoneCallNotification;
import ge.edu.sangu.observer.notifications.SmsNotification;
import ge.edu.sangu.observer.observable.NewsChannel;

public class Main {

    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();
        Notification phoneCallNotification = new PhoneCallNotification();


        // Adding observers
        channel.addObserver(emailNotification);
        channel.addObserver(smsNotification);
        channel.addObserver(phoneCallNotification);

        // Post news
        channel.setNews("Today we have lecture in Design Patterns");

        // Delete phoneCall notification
        channel.removeObserver(phoneCallNotification);

        System.out.println("After deletion of phoneCall notification");

        // Post news
        channel.setNews("Another message");
    }
}
