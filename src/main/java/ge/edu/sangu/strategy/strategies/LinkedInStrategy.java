package ge.edu.sangu.strategy.strategies;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class LinkedInStrategy implements SocialMediaStrategy {

    @Override
    public void post() {
        StringBuilder post = new StringBuilder("Hello my friends, ");
        post.append("\n");
        post.append("I am looking for new opportunities for Java developer. Please contact with me if you are hiring");

        System.out.println(post);
    }
}
