
package graphdatabase;

public class LinkedQueue<Type> implements UnboundedQueueInterface<Type> {

	private LinkedListNode<Type> front;
	private LinkedListNode<Type> rear;


	public LinkedQueue(){
		this.front = null;
		this.rear = null;
	}

	public void enqueue(Type element) {
		LinkedListNode<Type> newNode = new LinkedListNode<Type>(element);
		if(this.rear == null){
			this.front = newNode;
			this.rear = newNode;
		}else{
			this.rear.setLink(newNode);
			this.rear = newNode;
		}
	}

	public Type dequeue() throws QueueUnderFlowException {
		Type theThing;
		if(!isEmpty()){
			theThing = this.front.getData();
			this.front = this.front.getLink();
			if(this.front==null){
				this.rear = null;
			}
		}else{
			throw new QueueUnderFlowException("The queue is empty!");
		}

		return theThing;
	}

	public boolean isEmpty() {
		return (this.front==null);
	}

}

