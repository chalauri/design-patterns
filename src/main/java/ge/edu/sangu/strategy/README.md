# Social Media Strategy Pattern (Java)

This package demonstrates the use of the **Strategy Design Pattern** in Java by modeling social media posting behaviors.

## Description

The system allows a user to post messages on different social media platforms (e.g., Facebook, Twitter, LinkedIn). Each platform has its own message format. Using the Strategy pattern, the user can switch between different posting behaviors at runtime.

## Structure

- **SocialMediaStrategy**: Strategy interface with the `post()` method.
- **FacebookStrategy**, **LinkedInStrategy**, **TwitterStrategy**: Concrete strategies that implement platform-specific behavior.
- **UserWithComposition**: Context class that uses a strategy to post messages. You can change the strategy at runtime.
