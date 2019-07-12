package planet_obcapp.com.metro.graph;

import java.util.LinkedList;

class Graph{
    int vertices;
    LinkedList<Node>[] adjacencyList;

    public Graph(int vertices){
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i <vertices; i++) {
            adjacencyList[i] = new LinkedList<Node>();
        }
    }

    public void addEdge(int source, int destination){
        Node node = new Node(source, destination);
        //add edge
        adjacencyList[source].addLast(node);
    }
}
