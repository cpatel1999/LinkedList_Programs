public class LinkedList_1 {

    private Node head;

    public LinkedList_1() {
        head = null;
    }

    public LinkedList_1(LinkedList_1 list) {
        if (list.head == null) {
            head = null;
        } else {
            head = null;
            Node t1, t2, t3;

            t1 = list.head;
            t2 = null;
            t3 = null;

            while (t1 != null) {
                if (head == null) {
                    t3 = new Node(t1.data);
                    t3.next = null;
                    t2 = t3;
                    head = t3;
                } else {
                    t3 = new Node(t1.data);
                    t2.next = t3;
                    t2 = t3;
                }
                t1 = t1.next;
            }
            t2 = t3 = null;
        }
    }

    public LinkedList_1 clone() {
        return new LinkedList_1(this);
    }

    public void addToStart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addToEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = node;
        node.next = null;
    }

    public Node find(int data) {
        if (head == null) {
            return null;
        }

        Node t = head;
        while (t != null) {
            if (t.data == data) {
                return t;
            }
            t = t.next;
        }
        return null;
    }

    public boolean insertAfter(int i, int x) {
        if (head == null) {
            return false;
        }
        Node t = head;
        while (t != null && t.data != i) {
            t = t.next;
        }

        if (t == null) {
            System.out.println("Value " + i + " is not found!!!!");
        }
        Node node = new Node(x);
        node.next = t.next;
        t.next = node;

        return true;
    }

    public boolean insertBefore(int i, int x) {
        if (head == null) {
            return false;
        }
        if (head.data == i) {
            Node node = new Node(x);
            node.next = head;
            head = node;
        }
        Node t = head;
        while (t.next != null && t.next.data != i) {
            t = t.next;
        }
        if (t.next == null) {
            System.out.println("Value " + i + " is not found!!!!");
        }
        Node node = new Node(x);
        node.next = t.next;
        t.next = node;

        return true;
    }
}
