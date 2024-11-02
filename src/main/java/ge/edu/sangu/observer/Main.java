package ge.edu.sangu.observer;

import ge.edu.sangu.observer.interfaces.Subscriber;
import ge.edu.sangu.observer.notifications.EmailSubscriber;
import ge.edu.sangu.observer.notifications.PhoneCallSubscriber;
import ge.edu.sangu.observer.notifications.SmsSubscriber;
import ge.edu.sangu.observer.observable.News;
import ge.edu.sangu.observer.observable.SportNews;
import ge.edu.sangu.observer.observable.WeatherNews;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        News sportNews = new SportNews();
        News weatherNews = new WeatherNews();

        Subscriber emailSubscriber = new EmailSubscriber();
        Subscriber smsSubscriber = new SmsSubscriber();
        Subscriber phoneCallSubscriber = new PhoneCallSubscriber();

        // Adding observers to sport news
        sportNews.addObserver(smsSubscriber);
        sportNews.addObserver(emailSubscriber);
        sportNews.addObserver(phoneCallSubscriber);

        // Adding observers to weather news
        weatherNews.addObserver(emailSubscriber);
        weatherNews.addObserver(phoneCallSubscriber);
        weatherNews.addObserver(smsSubscriber);

        // Post news
        sportNews.publishNewArticle("Today is el classico");

        weatherNews.publishNewArticle("Today is sunny");

        // Remove phoneCallSubscriber from weatherNews
        weatherNews.removeObserver(phoneCallSubscriber);
        weatherNews.publishNewArticle("It started raining!!!");
    }
}
