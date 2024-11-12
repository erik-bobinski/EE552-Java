public class SingleLinkedList {

    // Each element in the singly linked list
    private class Node {
        int data;
        Node next;

        // Node constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;  // Head of linked list

    // Add new node at end of list
    public void add(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {
            head = newNode;  // If the list is empty, set head to the new node
        } else {
            Node current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Append the new node at the end
        }
    }

    // Reverses linked list in-place
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        // Traverse list and reverse the direction of each node
        while (current != null) {
            next = current.next;     // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current;      // Move previous one step forward
            current = next;          // Move current one step forward
        }
        head = previous;  // Update head to new first element(old last element)
    }

    // Displays the data in the list from the first node to the last node
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3); 
        list.add(4);

        System.out.println("Original List:");
        list.display();  // Expected Output: 1 2 3 4

        list.reverse();
        System.out.println("Reversed List:");
        list.display();  // Expected Output: 4 3 2 1
    }
}
