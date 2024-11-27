package LatihanPrakPBO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private List<String> friends;
    private Map<String, Integer> posts;

    public User(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Map<String, Integer> getPosts() {
        return posts;
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public void addPost(String post) {
        posts.put(post, 0);
    }

    public void likePost(String post) {
        if (posts.containsKey(post)) {
            int likes = posts.get(post);
            posts.put(post, likes + 1);
        } else {
            System.out.println("Post not found.");
        }
    }
}

public class MiniSocialMediaApp {
    private static Map<String, User> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMini Social Media App");
            System.out.println("1. Create User");
            System.out.println("2. Add Friend");
            System.out.println("3. Create Post");
            System.out.println("4. Like Post");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    addFriend();
                    break;
                case 3:
                    createPost();
                    break;
                case 4:
                    likePost();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        users.put(username, new User(username));
        System.out.println("User " + username + " created.");
    }

    private static void addFriend() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter friend's username: ");
        String friend = scanner.nextLine();

        if (users.containsKey(username) && users.containsKey(friend)) {
            users.get(username).addFriend(friend);
            System.out.println("Friend added successfully.");
        } else {
            System.out.println("User(s) not found.");
        }
    }

    private static void createPost() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your post: ");
        String post = scanner.nextLine();

        if (users.containsKey(username)) {
            users.get(username).addPost(post);
            System.out.println("Post created successfully.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void likePost() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter post to like: ");
        String post = scanner.nextLine();

        if (users.containsKey(username)) {
            users.get(username).likePost(post);
            System.out.println("Post liked.");
        } else {
            System.out.println("User not found.");
        }
    }
}
