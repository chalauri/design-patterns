package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class TwitterStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        StringBuilder post = new StringBuilder("Hello my friends, ");
        post.append("\n");
        post.append("I am happy to join twitter");

        System.out.println(post);
    }
}
