public class Main {
    
    public static void main(String[] args) {
        
        Graph myGraph = new Graph();

        // myGraph.addVertex("A");

        // myGraph.printGraph();

        // myGraph.addVertex("B");
        // myGraph.addVertex("C");

        // myGraph.addEdge("A", "B");
        // myGraph.addEdge("A", "C");
        // myGraph.addEdge("B", "A");

        // myGraph.printGraph();

        // myGraph.removeEdge("A", "B");

        // myGraph.printGraph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("D", "A");
        myGraph.addEdge("D", "B");
        myGraph.addEdge("D", "C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");

        myGraph.printGraph();

        myGraph.removeVertex("D");

        myGraph.printGraph();
    }
}
