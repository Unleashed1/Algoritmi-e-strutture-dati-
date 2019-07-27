import java.util.LinkedList;
import java.util.List;
import java.io.File;

public class Graph<V> {

    public Graph () {}

    public List<GraphNode<V>> getNodes() {
        return null;
    }

    public List<GraphNode<V>> getNeighbors(GraphNode<V> n){
        return null;
    }

    public GraphNode addNode(V value) {
        return null;
    }

    public void addEdge(GraphNode<V> s, GraphNode<V> t) {
        return;
    }

    public V getNodeValue(GraphNode<V> n) {
        return null;
    }

    public void removeEdge(GraphNode<V> v1, GraphNode<V> v2){

    }

    public void removeNode(GraphNode<V> v){

    }

    public static <V> Graph<V> readFF(File input){
      return null;
    }

    public String printAdj() {
		return "";
    }

    @Override
    public String toString(){
      return null;
    }

    public int nConComp(){
      return 0;
    }

    public List<Graph<V>> getConComp(){
      return null;
    }

    public static class GraphNode<V> {}
}
