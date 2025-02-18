public class RoundRobin {
    class Process {
        int processID, burstTime, remainingTime, priority;
        Process next; // For Circular Linked List

        public Process(int id, int burstTime, int priority) {
            this.processID = id;
            this.burstTime = burstTime;
            this.remainingTime = burstTime; // Track remaining execution time
            this.priority = priority;
            this.next = null;
        }
    }

    class CircularQueue {
        Process head = null, tail = null;

        // Add a process to the circular list
        void addProcess(int id, int burstTime, int priority) {
            Process newProcess = new Process(id, burstTime, priority);
            if (head == null) {
                head = tail = newProcess;
                tail.next = head; // Circular Link
            } else {
                tail.next = newProcess;
                tail = newProcess;
                tail.next = head; // Maintain circular structure
            }
        }

        // Remove a process from the list by process ID
        void removeProcess(int id) {
            if (head == null) return;

            Process current = head, prev = null;

            do {
                if (current.processID == id) {
                    if (current == head) head = head.next;
                    if (current == tail) tail = prev;
                    if (prev != null) prev.next = current.next;
                    System.out.println("Process " + id + " completed & removed.");
                    return;
                }
                prev = current;
                current = current.next;
            } while (current != head);
        }

        // Display the process queue
        void displayProcesses() {
            if (head == null) {
                System.out.println("No processes in queue.");
                return;
            }
            Process temp = head;
            System.out.println("Current Process Queue:");
            do {
                System.out.println("Process " + temp.processID + " | Burst Time: " + temp.remainingTime);
                temp = temp.next;
            } while (temp != head);
            System.out.println("--------------------");
        }

        // Simulate Round Robin Scheduling
        void roundRobin(int timeQuantum) {
            if (head == null) {
                System.out.println("No processes to schedule.");
                return;
            }

            int timeElapsed = 0, totalProcesses = 0, totalWaitingTime = 0, totalTurnAroundTime = 0;
            Process current = head;

            // Count total processes
            Process temp = head;
            do {
                totalProcesses++;
                temp = temp.next;
            } while (temp != head);

            // Execute processes in Round Robin fashion
            while (head != null) {
                displayProcesses();
                if (current.remainingTime > 0) {
                    int executeTime = Math.min(current.remainingTime, timeQuantum);
                    current.remainingTime -= executeTime;
                    timeElapsed += executeTime;

                    if (current.remainingTime == 0) { // Process finished
                        int turnAroundTime = timeElapsed;
                        int waitingTime = turnAroundTime - current.burstTime;
                        totalWaitingTime += waitingTime;
                        totalTurnAroundTime += turnAroundTime;

                        removeProcess(current.processID);
                    }
                }
                current = current.next; // Move to next process
            }

            // Calculate & Display Average Times
            System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / totalProcesses);
            System.out.println("Average Turnaround Time: " + (double) totalTurnAroundTime / totalProcesses);
        }
    }



}
