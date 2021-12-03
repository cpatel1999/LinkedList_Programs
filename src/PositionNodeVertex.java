class PositionNodeVertex {
    PositionNodeVertex next;
    Vertex v;
    public PositionNodeVertex()
    {
        next = null;
    }
    public PositionNodeVertex(PositionNodeVertex next)
    {
        this.next = next;
    }
    public PositionNodeVertex(Vertex v)
    {
        this.v = v;
    }
}