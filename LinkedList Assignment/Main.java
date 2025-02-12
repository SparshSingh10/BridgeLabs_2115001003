class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    // Constructor
    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private TaskNode head;
    private TaskNode tail;

    // Constructor
    public TaskScheduler() {
        this.head = null;
        this.tail = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head; // Make it circular
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Maintain circularity
        }
        System.out.println("Task added at the beginning: " + taskName);
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newTask;
            tail.next = head; // Make it circular
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; // Maintain circularity
        }
        System.out.println("Task added at the end: " + taskName);
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode current = head;
        for (int i = 1; i < position - 1 && current.next != head; i++) {
            current = current.next;
        }
        if (current.next == head && position > 1) {
            System.out.println("Position out of range.");
            return;
        }
        newTask.next = current.next;
        current.next = newTask;
        if (newTask.next == head) {
            tail = newTask; // Update tail if added at the end
        }
        System.out.println("Task added at position " + position + ": " + taskName);
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        TaskNode current = head;
        TaskNode prev = tail;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Maintain circularity
                    if (head == null) {
                        tail = null; // List is now empty
                    }
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev; // Update tail if last node is removed
                    }
                }
                System.out.println("Task removed: " + current.taskName);
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
        System.out.println("Task not found with ID: " + taskId);
    }

    // View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: " + head.taskName + " (ID: " + head.taskId + ", Priority: " + head.priority + ", Due Date: " + head.dueDate + ")");
        head = head.next; // Move to the next task
    }

    // Display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        TaskNode current = head;
        System.out.println("Tasks in the list:");
        do {
            System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search for tasks by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        TaskNode current = head;
        boolean found = false;
        System.out.println("Tasks with priority " + priority + ":");
        do {
            if (current.priority == priority) {
                System.out.println("Task ID: " + current.taskId + ", Task Name: " + current.taskName + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tasks found with this priority.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Adding tasks
        scheduler.addTaskAtBeginning(1, "Complete Project", 1, "2023-12-01");
        scheduler.addTaskAtEnd(2, "Write Report", 2, "2023-11-15");
        scheduler.addTaskAtPosition(3, "Prepare Presentation", 3, "2023-11-20", 2);

        // Display all tasks
        scheduler.displayAllTasks();

        // Search tasks by priority
        scheduler.searchByPriority(2);

        // View and move to the next task
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        // Remove a task
        scheduler.removeTaskById(2);

        // Display all tasks after removal
        scheduler.displayAllTasks();
    }
}