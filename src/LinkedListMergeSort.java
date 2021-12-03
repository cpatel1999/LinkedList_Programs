public class LinkedListMergeSort {

    Node head = null;

    public static Node mergeSort(Node h) {
        if (h == null || h.next == null) {
            return h;
        }

        Node middle = findMiddle(h);
        Node nodeAfterMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(h);
        Node right = mergeSort(nodeAfterMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    public static Node findMiddle(Node h) {
        if (h == null) {
            return h;
        }
        Node slow = h;
        Node fast = h;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.data < b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static void main(String args[]) {
        LinkedListMergeSort li = new LinkedListMergeSort();
        /*
         * Let us create a unsorted linked list to test the functions
         * created. The list shall be a: 2->3->20->5->10->15
         */
        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);
        li.push(8);

        // Apply merge Sort
        li.head = li.mergeSort(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.printList(li.head);
    }

    void push(int new_data) {
        /* allocate Node */
        Node node = new Node(new_data);

        /* link the old list off the new Node */
        node.next = head;

        /* move the head to point to the new Node */
        head = node;
    }

    // Utility function to print the linked list
    void printList(Node headref) {
        while (headref != null) {
            System.out.print(headref.data + " ");
            headref = headref.next;
        }
    }

}
