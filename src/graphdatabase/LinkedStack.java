
package graphdatabase;

public class LinkedStack<Type> implements UnboundedStackInterface<Type>{
	protected LinkedStackNode<Type> top;

	public LinkedStack(){
		this.top = null;
	}

	public void pop() throws StackUnderFlowException {
		if(!isEmpty()){
			this.top = this.top.getLink();
		}else{
			throw new StackUnderFlowException("Pop attempted but the Stack is empty");
		}
	}

	public Type top() throws StackUnderFlowException {
		Type topOfStack;
		if(!isEmpty()){
			topOfStack = this.top.getData();
		}else{
			throw new StackUnderFlowException("Top attempted but the Stack is empty.");
		}
		return topOfStack;
	}

	public boolean isEmpty() {
		boolean empty;
		if(this.top == null){
			empty = true;
		}else{
			empty = false;
		}
		return empty;
	}

	public void push(Type element) {
		LinkedStackNode<Type> newNode = new LinkedStackNode<Type>(element);
		newNode.setLink(this.top);
		this.top = newNode;
	}

}
