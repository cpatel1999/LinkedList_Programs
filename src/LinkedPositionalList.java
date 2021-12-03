public class LinkedPositionalList {

    PositionNodeVertex head;
    PositionNodeVertex tail;

    public LinkedPositionalList()
    {
        head = null;
        tail = null;
    }
    public void addToStart(Vertex v) {
        PositionNodeVertex node = new PositionNodeVertex(v);
        if(head == null && tail == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            node.next = head;
            head = node;
        }
        v.vertexPosition = node;
    }
    public void addToEnd(Vertex v)
    {
        PositionNodeVertex node = new PositionNodeVertex(v);
        node.next = null;
        if(tail == null && head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
        v.vertexPosition = node;
    }

    public void displayContents()
    {
        if(head == null)
        {
            return;
        }
        PositionNodeVertex t1 = head;
        String name;
        System.out.print(t1.v.name);
        t1 = t1.next;
        while(t1 != null)
        {
            name = t1.v.name;
            System.out.print("," + name);
            t1 = t1.next;
        }
    }
}
