
package graphdatabase;

public class Vertex<T> {

	private T data;
	private EdgeNode<T> link;
	private boolean mark;

	public Vertex(T data){
		this.data = data;
		this.link = null;
		this.mark = false;
	}

	public boolean isMark() {
		return mark;
	}

	public void setMark(boolean mark) {
		this.mark = mark;
	}

	public void setAdjacent(EdgeNode<T> node){
		this.link = node;
	}

	public EdgeNode<T> getAdjacents(){
		return this.link;
	}

	public void setData(T data){
		this.data = data;
	}

	public T getData(){
		return this.data;
	}

	public boolean equals(Vertex<T> other){
		if(this.getData()==other.getData()){
			return true;
		}else{
			return false;
		}
	}
}

