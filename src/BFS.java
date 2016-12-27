import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public void runBFS(Vertex root) {
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex + " ");
			//System.out.println(actualVertex.getAdjacencyList());
			
			for (Vertex vertex : actualVertex.getAdjacencyList()) {
				vertex.setVisited(true);
				queue.add(vertex);
			}			
		}
	}
}
