package DSA.SinglyLinkedList.SocialMediaFriendConnection;

import java.util.ArrayList;

class SocialMediaLinkedList {
    UserNode head;

    // Add new user
    public void addUser(int userID, String name, int age) {
        if (findUserByID(userID) != null) {
            System.out.println("User with ID " + userID + " already exists.");
            return;
        }
        UserNode newNode = new UserNode(userID, name, age);
        newNode.next = head;
        head = newNode;
        System.out.println("User added successfully.");
    }

    // Add friend connection
    public void addFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        if (!user1.friendIDs.contains(userID2)) user1.friendIDs.add(userID2);
        if (!user2.friendIDs.contains(userID1)) user2.friendIDs.add(userID1);
        System.out.println("Friend connection added between " + userID1 + " and " + userID2);
    }

    // Remove friend connection
    public void removeFriendConnection(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        user1.friendIDs.remove(Integer.valueOf(userID2));
        user2.friendIDs.remove(Integer.valueOf(userID1));
        System.out.println("Friend connection removed between " + userID1 + " and " + userID2);
    }

    // Find mutual friends
    public void findMutualFriends(int userID1, int userID2) {
        UserNode user1 = findUserByID(userID1);
        UserNode user2 = findUserByID(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        ArrayList<Integer> mutual = new ArrayList<>();
        for (int id : user1.friendIDs) {
            if (user2.friendIDs.contains(id)) mutual.add(id);
        }
        if (mutual.isEmpty()) {
            System.out.println("No mutual friends between " + userID1 + " and " + userID2);
        } else {
            System.out.println("Mutual friends of " + userID1 + " and " + userID2 + ": " + mutual);
        }
    }

    // Display all friends of a user
    public void displayFriends(int userID) {
        UserNode user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (user.friendIDs.isEmpty()) {
            System.out.println(user.name + " has no friends.");
            return;
        }
        System.out.println("Friends of " + user.name + " (User ID " + user.userID + "): " + user.friendIDs);
    }

    // Search user by ID
    public void searchByID(int userID) {
        UserNode user = findUserByID(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        displayUser(user);
    }

    // Search user by Name
    public void searchByName(String name) {
        boolean found = false;
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No user found with name: " + name);
    }

    // Count friends of each user
    public void countAllFriends() {
        if (head == null) {
            System.out.println("No users in the system.");
            return;
        }
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " (User ID " + temp.userID + ") has " + temp.friendIDs.size() + " friends.");
            temp = temp.next;
        }
    }

    // Helper to find user by ID
    private UserNode findUserByID(int userID) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userID == userID) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Helper to display user info
    private void displayUser(UserNode user) {
        System.out.println("---------------------------");
        System.out.println("User ID : " + user.userID);
        System.out.println("Name    : " + user.name);
        System.out.println("Age     : " + user.age);
        System.out.println("Friends : " + user.friendIDs);
    }
}

