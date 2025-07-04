package DSA.DoublyLinkedList.UndoRedoFunctionality;

class EditorHistory {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int size;
    private final int maxSize;

    public EditorHistory(int maxSize) {
        this.maxSize = maxSize;
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
    }

    // Add new state
    public void addState(String content) {
        TextStateNode newNode = new TextStateNode(content);

        // Cut off redo history if any
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            while (size > 1 && tail.next != null) {
                tail = tail.next;
            }
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = tail;
            size++;
        }

        // Enforce maxSize limit
        while (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }

        System.out.println("Added new state.");
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful.");
        } else {
            System.out.println("Cannot undo further.");
        }
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo successful.");
        } else {
            System.out.println("Cannot redo further.");
        }
    }

    // Display current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text State:\n------------------");
            System.out.println(current.content);
        } else {
            System.out.println("No states available.");
        }
    }

    // For debug: show entire history
    public void showHistory() {
        System.out.println("Full History (oldest to newest):");
        TextStateNode temp = head;
        int count = 1;
        while (temp != null) {
            System.out.println(count + ". " + temp.content);
            temp = temp.next;
            count++;
        }
    }
}

