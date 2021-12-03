class linkedlist {
    Node head;

    public linkedlist() {
        System.out.print("calling default");
        head = null;
    }

    public void addToStart(int value) {
//		if(head == null)
//		{
//			head = new Node(null,value);
//			return;
//		}
        head = new Node(head, value);
    }

    public void addToEnd(int value) {
        if (head == null) {
            head = new Node(null, value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(null, value);
    }

    public Node find(int value) {
        if (head == null) {
            System.out.println("empty list");
            return null;
        }
        Node temp = head;
        while (temp != null && temp.value != value) {
            temp = temp.next;
        }
        if (temp == null) {
            return null;
        }
        return temp;
    }

    public void insertAfter(int x, int v) {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.value == x) {
                temp.next = new Node(temp.next, v);
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("not found");
        }
    }

    public void insertBefore(int x, int v) {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        Node temp = head;
        if (temp.value == x) {
            head = new Node(head.next, v);
        }
        while (temp.next != null) {
            if (temp.next.value == x) {
                temp.next = new Node(temp.next, v);
                break;
            }
            temp = temp.next;
        }
        //System.out.println(temp);
        if (temp.next == null) {
            System.out.println("not found");
        }

    }

    public int size() {
        int counter = 0;
//		if(head == null)
//		{
//			return 0;
//		}
//		else
//		{
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
//		}
    }

    public boolean contains(int v) {

        if (find(v) != null)
            return true;
        else
            return false;

//		Node temp = head;
//		while(temp!=null)
//		{
//			if(temp.value == v)
//			{
//				return true;
//			}
//			temp = temp.next;
//		}
//		return false;
    }

    public void replace(int x, int v) {
//		if(head == null)
//		{
//			System.out.println("empty list");
//			return;
//		}
//		Node temp = head;
//		while(temp!=null)
//		{
//			if(temp.value == x)
//			{
//				temp.value = v;
//				break;
//			}
//			temp = temp.next;
//		}
        Node t = find(x);
        if (t == null) {
            System.out.println("\nCould not find value " + x + " in the list; no replacement is possible.");
            //return false;
        }
        t.value = v;
        //return true;

    }

    public void showListContents() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public class Node {
        Node next;
        int value;

        public Node() {
            next = null;
            value = 0;
        }

        public Node(Node n, int v) {
            next = n;
            value = v;
        }
    }

}

public class HashingWithLL {
    linkedlist[] l;

    public HashingWithLL(int size) {
        System.out.println("-------Default---------");
        l = new linkedlist[size];
        for (int i = 0; i < size; i++) {
            l[i] = new linkedlist();
        }
    }

    public static void main(String args[]) {
        HashingWithLinkedList h = new HashingWithLinkedList(5);
        h.insert(12);
        h.printHashTable();
        h.insert(45);
        h.printHashTable();
        h.insert(15);
        h.insert(35);
        h.insert(23);
        h.printHashTable();
    }

    public void insert(int x) {
        int v = hashValue(x);
        //System.out.println(v);
        l[v].addToStart(x);
    }

    public int hashValue(int value) {
        return (value % 5);
    }

    public void printHashTable() {
        System.out.println();
        for (int i = 0; i < l.length; i++) {
            System.out.print("-------At " + i + ":  -----------");
            l[i].showListContents();
            System.out.println("----------------");
        }
    }
}