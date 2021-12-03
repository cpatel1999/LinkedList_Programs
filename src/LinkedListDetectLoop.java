public class LinkedListDetectLoop {

    static Node head;

   /* public static boolean detectLoop(Node node) {
        Node slow, fast;
        slow = node;
        fast = node;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeLoop(slow, node);
                return true;
            }
        }
        return false;
    }*/

    public int detectLoop(Node node)
    {
        Node slow, fast;
        slow = node;
        fast = node;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;

            if(slow == fast)
            {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    public static void removeLoop(Node loop, Node node) {
        Node ptr1 = loop;
        Node ptr2 = loop;

        int k = 1;
        while (ptr1.next != ptr2) {
            ptr1 = ptr1.next;
            k++;
        }

        ptr1 = head;
        ptr2 = head;

        for (int i = 0; i < k; i++) {
            ptr2 = ptr2.next;
        }

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }

        ptr2.next = null;
    }

    public static void main(String args[]) {
        LinkedListDetectLoop list = new LinkedListDetectLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
