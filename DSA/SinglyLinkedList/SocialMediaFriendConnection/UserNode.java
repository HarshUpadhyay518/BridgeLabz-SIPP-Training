package DSA.SinglyLinkedList.SocialMediaFriendConnection;

import java.util.ArrayList;

class UserNode {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friendIDs;
    UserNode next;

    public UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
        this.next = null;
    }
}

