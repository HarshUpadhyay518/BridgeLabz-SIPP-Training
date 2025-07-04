package DSA.CircularLinkedList.RoundRobinSchedulingAlgorithm;

import java.util.*;

public class RoundRobinScheduler {
    private ProcessNode head = null;
    private final int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int id, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(id, burst, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Process added: ID=" + id + ", Burst=" + burst + ", Priority=" + priority);
    }

    // Remove process by ID
    private void removeProcess(int id) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.processID == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display all processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        System.out.println("\n--- Current Process Queue ---");
        ProcessNode temp = head;
        do {
            System.out.println("ID: " + temp.processID +
                    ", Remaining: " + temp.remainingTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin
    public void simulate() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        List<Integer> waitTimes = new ArrayList<>();
        List<Integer> turnaroundTimes = new ArrayList<>();

        System.out.println("\n--- Starting Round Robin Scheduling ---");
        ProcessNode current = head;

        while (head != null) {
            if (current.remainingTime > 0) {
                int executed = Math.min(timeQuantum, current.remainingTime);
                System.out.println("\nProcess ID " + current.processID + " executing for " + executed + " units.");
                current.remainingTime -= executed;
                time += executed;

                // Update turnaround time if finished
                if (current.remainingTime == 0) {
                    current.turnaroundTime = time;
                    current.waitingTime = current.turnaroundTime - current.burstTime;
                    turnaroundTimes.add(current.turnaroundTime);
                    waitTimes.add(current.waitingTime);

                    System.out.println("Process ID " + current.processID + " completed.");
                    removeProcess(current.processID);

                    if (head == null) break;
                    current = head;
                } else {
                    current = current.next;
                }
            } else {
                current = current.next;
            }
            displayProcesses();
            }
            double avgWait = waitTimes.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        double avgTurn = turnaroundTimes.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.printf("\nSimulation Complete!\nAverage Waiting Time: %.2f\nAverage Turnaround Time: %.2f\n", avgWait, avgTurn);
        }
    }

