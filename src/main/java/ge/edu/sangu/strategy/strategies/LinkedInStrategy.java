package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class LinkedInStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        System.out.println("I am looking for new opportunities for Java developer. Please contact with me if you are hiring");
    }
}
