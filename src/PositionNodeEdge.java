public class PositionNodeEdge {
    PositionNodeEdge next;
    Edge e;
    public PositionNodeEdge()
    {
        next = null;
    }
    public PositionNodeEdge(PositionNodeEdge next)
    {
        this.next = next;
    }
    public PositionNodeEdge(Edge e)
    {
        this.e = e;
    }
}
