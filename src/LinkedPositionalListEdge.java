public class LinkedPositionalListEdge {

    PositionNodeEdge head;
    PositionNodeEdge tail;

    public LinkedPositionalListEdge() {
        head = null;
        tail = null;
    }

    public void addToStart(Edge e) {
        PositionNodeEdge node = new PositionNodeEdge(e);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        e.edgePosition = node;
    }

    public void addToEnd(Edge e) {
        PositionNodeEdge node = new PositionNodeEdge(e);
        node.next = null;
        if (tail == null && head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        e.edgePosition = node;
    }

    public void displayContents() {
        if (head == null) {
            return;
        }
        PositionNodeEdge t1 = head;
        String name;
        System.out.print(t1.e.name);
        t1 = t1.next;
        while (t1 != null) {
            name = t1.e.name;
            System.out.print("," + name);
            t1 = t1.next;
        }
    }
}
