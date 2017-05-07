
package graphdatabase;

public class LinkedListNode<Type> {

	private Type data;
	private LinkedListNode<Type> ref;
	
	public LinkedListNode(Type info){
		this.data = info;
		this.ref = null;
	}
	
	public void setLink(LinkedListNode<Type> anode){
		this.ref = anode;
	}
	
	public Type getData(){
		return this.data;
	}
	
	public LinkedListNode<Type> getLink(){
		return this.ref;
	}
	
	public void setData(Type info){
		this.data = info;
	}
}

