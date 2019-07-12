package planet_obcapp.com.metro.graph;

import java.util.LinkedList;

public class GraphPrintAllPaths {

    public void print(Graph graph, int start, int end, String path, boolean[] visited){
        String newPath = path +  "->" + start;
        visited[start] = true;
        LinkedList<Node> list = graph.adjacencyList[start];
        for (int i = 0; i <list.size() ; i++) {
            Node node = list.get(i);
            if(node.destination!=end && visited[node.destination]==false){
//                visited[node.destination] = true;
                print(graph,node.destination,end,newPath,visited);
            }else if(node.destination==end){
                System.out.println(newPath + "->" + node.destination);
            }
        }
        //remove from path
        visited[start] = false;
    }

    public void printAllPaths(Graph graph, int start, int end){
        boolean[] visited = new boolean[graph.vertices];
        visited[start] = true;
        print(graph, start, end, "", visited);
    }

    public static void main(String[] args) {
        int vertices = 14;
        Graph graph = new Graph(vertices);



        graph.addEdge(0, 1);
        graph.addEdge(1, 3);
        graph.addEdge(1, 6);
        graph.addEdge(3, 5);
        graph.addEdge(3, 2);
        graph.addEdge(5, 4);
        graph.addEdge(5, 6);

        graph.addEdge(1, 0);
        graph.addEdge(3, 1);
        graph.addEdge(6, 1);
        graph.addEdge(5, 3);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        graph.addEdge(6, 5);


        GraphPrintAllPaths p = new GraphPrintAllPaths();
      //  p.printAllPaths(graph,0,6);
        p.printAllPaths(graph,0,5);

    }
}

