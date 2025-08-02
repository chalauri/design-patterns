package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class FacebookStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        System.out.println("Hello my friends, This is my facebook post about recent news.");
    }
}
