package DSA.Collections.QueueInterface;

class CircularBuffer {
    private int[] buffer;
    private int size;
    private int head = 0; // oldest element
    private int count = 0; // number of elements

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        int tail = (head + count) % size;
        if (count == size) {
            head = (head + 1) % size; // overwrite oldest
        } else {
            count++;
        }
        buffer[tail] = value;
    }

    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(head + i) % size]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // [1, 2, 3]
        cb.insert(4);
        cb.display(); // [2, 3, 4]
    }
}

