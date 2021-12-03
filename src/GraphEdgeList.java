public class GraphEdgeList {

    public static void main(String args[])
    {
        LinkedPositionalList vertexPositionList = new LinkedPositionalList();
        LinkedPositionalListEdge edgePositionList = new LinkedPositionalListEdge();

        Vertex u = new Vertex("u");
        Vertex v = new Vertex("v");
        Vertex w = new Vertex("w");
        Vertex z = new Vertex("z");

        Edge a = new Edge("a");
        Edge b = new Edge("b");
        Edge c = new Edge("c");
        Edge d = new Edge("d");

        vertexPositionList.addToEnd(u);
        vertexPositionList.addToEnd(v);
        vertexPositionList.addToEnd(w);
        vertexPositionList.addToEnd(z);

        edgePositionList.addToEnd(a);
        edgePositionList.addToEnd(b);
        edgePositionList.addToEnd(c);
        edgePositionList.addToEnd(d);

        a.start = u;
        a.end = v;

    }

}
