class LinkedList
{
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public LinkedList()
    {
        head = null;
    }

    public LinkedList(LinkedList l)
    {
        if(l.head == null)
        {
            head = null;
        }
        else {
            head = null;
            Node t1, t2, t3;

            t1 = l.head;
            t2 = null;
            t3 = null;

            while (t1 != null)
            {
                if(head == null)
                {
                    t3 = new Node(t1.data);
                    t2 = t3;
                    head = t2;
                }
                else
                {
                    t3 = new Node(t1.data);
                    t2.next = t3;
                    t2 = t3;
                }
                t1 = t1.next;
            }
            t2 = t3 = null;
        }
    }

    public void addToStart(int key)
    {
        Node node = new Node(key);
        node.next = head;
        head = node;
    }

    public void showListContents() {
        if (head == null) {
            System.out.println("empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}

public class HashingWithLinkedList {

    LinkedList[] l;

    public HashingWithLinkedList(int size)
    {
        l = new LinkedList[size];
        for(int i = 0; i < size; i++)
        {
            l[i] = new LinkedList();
        }
    }

    public void insert(int data)
    {
        int key = hashValue(data);
        l[key].addToStart(data);
    }

    public void printHashTable() {
        System.out.println();
        for (int i = 0; i < l.length; i++) {
            System.out.print("-------At " + i + ":  -----------");
            l[i].showListContents();
            System.out.println("----------------");
        }
    }

    public int hashValue(int data)
    {
        return (data % 10);
    }
    public static void main(String args[])
    {
        HashingWithLL h = new HashingWithLL(5);
        h.insert(12);
        h.printHashTable();
        h.insert(45);
        h.printHashTable();
        h.insert(15);
        h.insert(35);
        h.insert(23);
        h.printHashTable();
    }
}
