package ge.edu.sangu.strategy.users;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class User {

    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void postOnSocialMedia(SocialMediaStrategy socialMediaStrategy) {
        socialMediaStrategy.post();
    }
}
