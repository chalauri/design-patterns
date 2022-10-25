package ge.edu.sangu.strategy.users;

import ge.edu.sangu.strategy.interfaces.SocialMediaStrategy;

public class UserWithComposition {

    private SocialMediaStrategy socialMediaStrategy;

    public UserWithComposition(SocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }

    public void postOnSocialMedia() {
        socialMediaStrategy.post();
    }

    public void setSocialMediaStrategy(SocialMediaStrategy socialMediaStrategy) {
        this.socialMediaStrategy = socialMediaStrategy;
    }
}
