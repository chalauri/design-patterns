package ge.edu.sangu.strategy;

import ge.edu.sangu.strategy.strategies.FacebookStrategy;
import ge.edu.sangu.strategy.strategies.LinkedInStrategy;
import ge.edu.sangu.strategy.strategies.TwitterStrategy;
import ge.edu.sangu.strategy.users.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("username", "password");

        user.postOnSocialMedia(new LinkedInStrategy());

        user.postOnSocialMedia(new TwitterStrategy());

        user.postOnSocialMedia(new FacebookStrategy());
    }
}
