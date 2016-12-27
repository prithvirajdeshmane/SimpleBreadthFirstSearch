import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(int data){
		this.data = data;
		this.adjacencyList = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> neighborList) {
		this.adjacencyList = neighborList;
	}
	
	@Override
	public String toString(){
		return ""+this.data;
	}
	
	public void addAdjacentVertex(Vertex vertex) {
		this.adjacencyList.add(vertex);
	}
}
