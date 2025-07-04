package DSA.CircularLinkedList.RoundRobinSchedulingAlgorithm;

class ProcessNode {
    int processID;
    int burstTime;
    int priority;

    int remainingTime; // For simulation
    int waitingTime;
    int turnaroundTime;

    ProcessNode next;

    public ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

