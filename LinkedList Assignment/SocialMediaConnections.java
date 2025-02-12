import java.util.ArrayList;
import java.util.List;

class Node {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    Node next;

    public Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private Node head;

    public SocialMedia() {
        head = null;
    }

    // Add a user to the system
    public void addUser(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);
        newNode.next = head;
        head = newNode;
    }

    // Add a friend connection between two users
    public void addFriend(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 != null && user2 != null && !user1.friendIds.contains(userId2)) {
            user1.friendIds.add(userId2);
            user2.friendIds.add(userId1);
            System.out.println("Friend connection added between user " + userId1 + " and user " + userId2);
        } else {
            System.out.println("Friend connection already exists or user not found.");
        }
    }

    // Remove a friend connection between two users
    public void removeFriend(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
            System.out.println("Friend connection removed between user " + userId1 + " and user " + userId2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>();
            for (int friend1 : user1.friendIds) {
                if (user2.friendIds.contains(friend1)) {
                    mutualFriends.add(friend1);
                }
            }
            if (!mutualFriends.isEmpty()) {
                System.out.println(
                        "Mutual friends between user " + userId1 + " and user " + userId2 + ": " + mutualFriends);
            } else {
                System.out.println("No mutual friends found.");
            }
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        Node user = findUserById(userId);
        if (user != null) {
            System.out.println("Friends of user " + userId + ": " + user.friendIds);
        } else {
            System.out.println("User not found.");
        }
    }

    public void searchUser(String query) {
        Node user = null;

        // Check if the query is numeric
        if (query.matches("\\d+")) {
            int userId = Integer.parseInt(query); // Convert query to user ID
            user = findUserById(userId); // Search by ID
        } else {
            user = findUserByName(query); // Search by Name
        }

        // If user found, display information
        if (user != null) {
            System.out.println("User found: " + user.name + ", Age: " + user.age + ", UserID: " + user.userId);
        } else {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println(
                    "User " + temp.name + " (ID: " + temp.userId + ") has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    // Find user by ID
    private Node findUserById(int userId) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Find user by Name
    private Node findUserByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}

public class SocialMediaConnections {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 28);
        sm.addUser(3, "Charlie", 30);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.findMutualFriends(1, 2);

        sm.searchUser("Bob");
        sm.searchUser("4");

        sm.countFriends();
    }
}
