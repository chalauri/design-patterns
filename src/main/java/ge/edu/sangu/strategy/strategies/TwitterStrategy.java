package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class TwitterStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        System.out.println("Hello my friends, I am happy to join twitter");
    }
}
