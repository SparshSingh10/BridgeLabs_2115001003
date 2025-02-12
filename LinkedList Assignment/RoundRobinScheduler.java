class ProcessNode {
    int pid;
    int burstTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class CircularLinkedList {
    private ProcessNode head;
    private ProcessNode tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
    }

    // Remove a process by Process ID after its execution

    public void removeProcess(int pid) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ProcessNode temp = head;
        ProcessNode prev = null;

        do {
            if (temp.pid == pid) {

                if (temp == head && temp == tail) {
                    head = null;
                    tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Not found");

    }

    public void displayProcesses() {
    if (head == null) {
    System.out.println("No processes in the queue.");
    return;
    }

    ProcessNode temp = head;
    System.out.println("Processes in the queue:");
    do {
    System.out.println("PID: " + temp.pid + ", Burst Time: " + temp.burstTime +
    ", Priority: " + temp.priority);
    temp = temp.next;
    } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void roundRobinScheduling(int timeQuantum) {
    if (head == null) {
    System.out.println("No processes to schedule.");
    return;
    }

    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;
    int totalProcesses = 0;

    ProcessNode current = head;
    while (head != null) {
    System.out.println("Executing Process " + current.pid + " with Burst Time " +
    current.burstTime);

    if (current.burstTime > timeQuantum) {
    current.burstTime -= timeQuantum;
    totalWaitingTime += timeQuantum;
    } else {
    totalWaitingTime += current.burstTime;
    totalTurnaroundTime += totalWaitingTime;
    System.out.println("Process " + current.pid + " completed.");
    removeProcess(current.pid);
    totalProcesses++;
    }

    current = current.next;
    displayProcesses();
    }

    // Calculate and display average waiting and turnaround time
    double avgWaitingTime = (double) totalWaitingTime / totalProcesses;
    double avgTurnaroundTime = (double) totalTurnaroundTime / totalProcesses;
    System.out.println("Average Waiting Time: " + avgWaitingTime);
    System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
    }

public class RoundRobinScheduler {
    public static void main(String[] args) {
        CircularLinkedList scheduler = new CircularLinkedList();

        // Add processes
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        // Display processes
        scheduler.displayProcesses();

        // Simulate Round Robin Scheduling with time quantum = 3
        scheduler.roundRobinScheduling(3);
    }
}