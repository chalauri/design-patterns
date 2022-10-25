package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class FacebookStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        StringBuilder post = new StringBuilder("Hello my friends, ");
        post.append("\n");
        post.append("This is my facebook post about recent news.");

        System.out.println(post);
    }
}
