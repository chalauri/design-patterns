package ge.edu.sangu.strategy;

import ge.chalauri.strategy.strategies.FacebookStrategy;
import ge.chalauri.strategy.strategies.LinkedInStrategy;
import ge.chalauri.strategy.strategies.TwitterStrategy;
import ge.chalauri.strategy.users.User;

public class Main {

    public static void main(String[] args) {

        User user = new User("username", "password");

        // Post on facebook
        user.postOnSocialMedia(new FacebookStrategy());

        // Post on twitter
        user.postOnSocialMedia(new TwitterStrategy());

        // Post on linkedIn
        user.postOnSocialMedia(new LinkedInStrategy());

    }
}
