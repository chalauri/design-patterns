package ge.edu.sangu.strategy;

import ge.edu.sangu.strategy.strategies.FacebookStrategy;
import ge.edu.sangu.strategy.strategies.LinkedInStrategy;
import ge.edu.sangu.strategy.strategies.TwitterStrategy;
import ge.edu.sangu.strategy.users.UserWithComposition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String strategyName = reader.readLine();

        UserWithComposition user = new UserWithComposition(null);

        switch (strategyName) {
            case "Facebook": {
                user.setSocialMediaStrategy(new FacebookStrategy());
                user.postOnSocialMedia();
                break;
            }
            case "LinkedIn": {
                user.setSocialMediaStrategy(new LinkedInStrategy());
                user.postOnSocialMedia();
                break;
            }
            case "Twitter": {
                user.setSocialMediaStrategy(new TwitterStrategy());
                user.postOnSocialMedia();
                break;
            }
            default:
                throw new Exception("Strategy Not Found!");
        }

    }
}
