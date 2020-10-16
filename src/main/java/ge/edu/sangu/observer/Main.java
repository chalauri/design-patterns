package ge.edu.sangu.observer;

import ge.edu.sangu.observer.interfaces.Notification;
import ge.edu.sangu.observer.notifications.EmailNotification;
import ge.edu.sangu.observer.notifications.PhoneCallNotification;
import ge.edu.sangu.observer.notifications.SmsNotification;
import ge.edu.sangu.observer.observable.News;
import ge.edu.sangu.observer.observable.SportNews;
import ge.edu.sangu.observer.observable.WeatherNews;

public class Main {

    public static void main(String[] args) {
        News sportNews = new SportNews();
        News weatherNews = new WeatherNews();

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();
        Notification phoneCallNotification = new PhoneCallNotification();

        // Adding observers
        sportNews.addObserver(smsNotification);
        weatherNews.addObserver(emailNotification);
        weatherNews.addObserver(phoneCallNotification);

        // Post news
        sportNews.setNews("Georgia won");
        weatherNews.setNews("Today is sunny");
    }
}
