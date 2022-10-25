package ge.edu.sangu.strategy;

import ge.edu.sangu.strategy.strategies.LinkedInStrategy;
import ge.edu.sangu.strategy.strategies.TwitterStrategy;
import ge.edu.sangu.strategy.users.UserWithComposition;

public class Main {

    public static void main(String[] args) {

        UserWithComposition user = new UserWithComposition(new LinkedInStrategy());
        user.postOnSocialMedia();

        System.out.println();

        user.setSocialMediaStrategy(new TwitterStrategy());
        user.postOnSocialMedia();
    }
}
