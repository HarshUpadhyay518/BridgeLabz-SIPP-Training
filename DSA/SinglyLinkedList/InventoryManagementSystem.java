package DSA.SinglyLinkedList;

import java.util.Scanner;

class ItemNode {
    String itemName;
    int itemID;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    ItemNode head;

    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Item added at beginning.");
    }

    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            System.out.println("Item added at end.");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Item added at end.");
    }

    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(name, id, qty, price);
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Item added at position " + pos + ".");
    }

    public void removeByID(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemID == id) {
            head = head.next;
            System.out.println("Item with ID " + id + " removed.");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemID != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item ID not found: " + id);
        } else {
            temp.next = temp.next.next;
            System.out.println("Item with ID " + id + " removed.");
        }
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated for Item ID " + id + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found: " + id);
    }

    public void searchByID(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item ID not found: " + id);
    }

    public void searchByName(String name) {
        boolean found = false;
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No item found with name: " + name);
        }
    }

    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory Items:");
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode node) {
        System.out.println("--------------------------");
        System.out.println("Item Name: " + node.itemName);
        System.out.println("Item ID  : " + node.itemID);
        System.out.println("Quantity : " + node.quantity);
        System.out.println("Price    : " + node.price);
    }

    // Sorting
    public void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
        System.out.println("Inventory sorted by Name (" + (ascending ? "Ascending" : "Descending") + ").");
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
        System.out.println("Inventory sorted by Price (" + (ascending ? "Ascending" : "Descending") + ").");
    }

    private ItemNode mergeSortByName(ItemNode head, boolean ascending) {
        if (head == null || head.next == null) return head;
        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSortByName(head, ascending);
        ItemNode right = mergeSortByName(nextOfMiddle, ascending);

        return sortedMergeByName(left, right, ascending);
    }

    private ItemNode sortedMergeByName(ItemNode a, ItemNode b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        int cmp = a.itemName.compareToIgnoreCase(b.itemName);
        if ((ascending && cmp <= 0) || (!ascending && cmp > 0)) {
            a.next = sortedMergeByName(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMergeByName(a, b.next, ascending);
            return b;
        }
    }

    private ItemNode mergeSortByPrice(ItemNode head, boolean ascending) {
        if (head == null || head.next == null) return head;
        ItemNode middle = getMiddle(head);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSortByPrice(head, ascending);
        ItemNode right = mergeSortByPrice(nextOfMiddle, ascending);

        return sortedMergeByPrice(left, right, ascending);
    }

    private ItemNode sortedMergeByPrice(ItemNode a, ItemNode b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition = ascending ? (a.price <= b.price) : (a.price > b.price);
        if (condition) {
            a.next = sortedMergeByPrice(a.next, b, ascending);
            return a;
        } else {
            b.next = sortedMergeByPrice(a, b.next, ascending);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();
        int choice = -1;

        while (choice != 12) {
            System.out.println("\n--- Inventory Management Menu ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity by ID");
            System.out.println("6. Search Item by ID");
            System.out.println("7. Search Item by Name");
            System.out.println("8. Display All Items");
            System.out.println("9. Calculate Total Inventory Value");
            System.out.println("10. Sort by Name");
            System.out.println("11. Sort by Price");
            System.out.println("12. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.print("Item Name: "); String name = sc.nextLine();
                System.out.print("Item ID: "); int id = sc.nextInt();
                System.out.print("Quantity: "); int qty = sc.nextInt();
                System.out.print("Price: "); double price = sc.nextDouble();
                sc.nextLine();
                if (choice == 1) inventory.addAtBeginning(name, id, qty, price);
                else if (choice == 2) inventory.addAtEnd(name, id, qty, price);
                else {
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    inventory.addAtPosition(pos, name, id, qty, price);
                }
            }
            else if (choice == 4) {
                System.out.print("Enter Item ID to Remove: "); int id = sc.nextInt(); sc.nextLine();
                inventory.removeByID(id);
            }
            else if (choice == 5) {
                System.out.print("Enter Item ID to Update Quantity: "); int id = sc.nextInt();
                System.out.print("Enter New Quantity: "); int qty = sc.nextInt(); sc.nextLine();
                inventory.updateQuantity(id, qty);
            }
            else if (choice == 6) {
                System.out.print("Enter Item ID to Search: "); int id = sc.nextInt(); sc.nextLine();
                inventory.searchByID(id);
            }
            else if (choice == 7) {
                System.out.print("Enter Item Name to Search: "); String name = sc.nextLine();
                inventory.searchByName(name);
            }
            else if (choice == 8) {
                inventory.displayAll();
            }
            else if (choice == 9) {
                inventory.calculateTotalValue();
            }
            else if (choice == 10) {
                System.out.print("Ascending (true/false): "); boolean asc = sc.nextBoolean(); sc.nextLine();
                inventory.sortByName(asc);
            }
            else if (choice == 11) {
                System.out.print("Ascending (true/false): "); boolean asc = sc.nextBoolean(); sc.nextLine();
                inventory.sortByPrice(asc);
            }
            else if (choice == 12) {
                System.out.println("Exiting...");
            }
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}

