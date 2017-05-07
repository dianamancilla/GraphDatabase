
package graphdatabase;

public class LinkedStackNode<Type> {
	protected Type data;
	protected LinkedStackNode<Type> ref;

	public LinkedStackNode(Type data){
		this.data = data;
		this.ref = null;
	}

	public void setData(Type data){
		this.data = data;
	}

	public void setLink(LinkedStackNode<Type> ref){
		this.ref = ref;
	}

	public Type getData(){
		return this.data;
	}

	public LinkedStackNode<Type> getLink(){
		return this.ref;
	}
}

