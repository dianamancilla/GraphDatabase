
package graphdatabase;

public class DirWeightGraph<T> implements DirWeightGraphInterface<T>{

	private Vertex<T>[] vertexArray;
	private int numVertices;
	private int maxVertices;
	private EdgeNode<T> location;
	private EdgeNode<T> previous;
	private int nextUnmarked;

	public DirWeightGraph(int capacity){
		this.maxVertices = capacity;
		this.vertexArray = new Vertex[capacity];
		this.numVertices = 0;
		this.nextUnmarked = -1;
	}

	public boolean isEmpty() { //WORKS
		return (this.numVertices==0);
	}

	public boolean isFull() { //WORKS
		return (this.numVertices==this.maxVertices);
	}

	public void addVertex(T vertex) { //WORKS
		if(!isFull()){
			for(int i=0; i<this.maxVertices; i++){
				if(this.vertexArray[i]==null){
					this.vertexArray[i] = new Vertex<T>(vertex);
					this.numVertices++;
					break;
				}
			}
		}else{
			System.out.println("The vertex array is full");
		}
	}

	public boolean hasVertex(T vertex) { //WORKS
		boolean has = false;
		Vertex<T> other = new Vertex<T>(vertex);

		for(int i=0; i<this.numVertices; i++){
			if(this.vertexArray[i].equals(other)){
				has = true;
				break;
			}
		}
		return has;
	}

	public String printSucursal(T vertex) { //WORKS
		Vertex<T> other = new Vertex<T>(vertex);
		String bla = "";
		for(int i=0; i<this.numVertices; i++){
			if(this.vertexArray[i].equals(other)){
				bla = this.vertexArray[i].getData().toString();
				break;
			}
		}
		
		return bla;
	}
	
	public void addEdge(T fromVertex, T toVertex, int weight) { //WORKS
		int from = indexIs(fromVertex);
		int to = indexIs(toVertex);

		EdgeNode<T> newNode = new EdgeNode<T>(to, weight, null);

		this.location = this.vertexArray[from].getAdjacents();
		previous = null;

		while(this.location!=null){
			this.previous = this.location;
			this.location = this.location.getLink();
		}

		if(this.previous==null){
			this.vertexArray[from].setAdjacent(newNode);
		}else{
			this.previous.setLink(newNode);
		}
	}

	public int indexIs(T aVertex) { //WORKS
		int index = 0;
		Vertex<T> theVertex = new Vertex<T>(aVertex);
		while(!theVertex.equals(this.vertexArray[index])){
			index++;
		}
		return index;
	}

	public int weightIs(T fromVertex, T toVertex) { //WORKS
		int from = indexIs(fromVertex);
		int to = indexIs(toVertex);

		this.location = this.vertexArray[from].getAdjacents();

		while(this.location.getAdjVertex() != to){
			this.location = this.location.getLink();
		}
		return (this.location.getWeight());
	}

	public LinkedQueue<T> getToVertices(T vertex) {
		LinkedQueue<T> adjVert = new LinkedQueue<T>();

		for(int toIndex=1; toIndex<this.numVertices; toIndex++){
			//T toVertex = (T) this.vertexArray[toIndex];
			if(hasEdge(vertex,this.vertexArray[toIndex].getData()) != false){
				adjVert.enqueue(this.vertexArray[toIndex].getData());
			}
		}
		return adjVert;
	}

	public boolean hasEdge(T vertex1, T vertex2){
		int from = indexIs(vertex1);
		int to = indexIs(vertex2);
		boolean has = false;

		this.location = this.vertexArray[from].getAdjacents();

		if(this.location!=null && this.location.getAdjVertex() == to){
			has = true;
		}else{
			while(this.location != null && this.location.getAdjVertex() != to){
				this.location = this.location.getLink();
			}
			if(this.location == null){
				has=false;
			}
			else if(this.location.getAdjVertex()==to){
				has = true;
			}
			else{
				has = false;
			}
		}
		return has;
	}

	public void clearMarks() { // WORKS
		for(int i = 0; i<this.numVertices; i++){
			this.vertexArray[i].setMark(false);
		}
	}

	public void markVertex(T vertex) { // WORKS

		Vertex<T> theVertex = new Vertex<T>(vertex);

		int index = 0;
		while(!this.vertexArray[index].equals(theVertex)){
			index++;
		}
		this.vertexArray[index].setMark(true);
	}

	public boolean isMarked(T vertex) { // WORKS
		Vertex<T> theVertex = new Vertex<T>(vertex);
		int index = 0;
		while(!this.vertexArray[index].equals(theVertex)){
			index++;
		}
		return (this.vertexArray[index].isMark());
	}

	public T getUnmarked() { // WORKS
		T unmarked = null;
		this.nextUnmarked++;

		if(this.nextUnmarked != this.numVertices + 1){
			unmarked = this.vertexArray[this.nextUnmarked].getData();
		}
		return unmarked;
	}

}

