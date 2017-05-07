
package graphdatabase;


public interface DirWeightGraphInterface<T> {

	boolean isEmpty();
	
	boolean isFull();
	
	void addVertex(T vertex);

	boolean hasVertex(T vertex);
	
	void addEdge(T fromVertex, T toVertex, int weight);
	
	int weightIs(T fromVertex, T toVertex);
	
	LinkedQueue<T> getToVertices(T vertex);
	
	void clearMarks();
	
	void markVertex(T vertex);
	
	boolean isMarked(T vertex);
	
	T getUnmarked();
}
