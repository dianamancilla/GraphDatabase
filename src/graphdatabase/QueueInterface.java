
package graphdatabase;

public interface QueueInterface<Type> {
	
	public Type dequeue() throws QueueUnderFlowException;

	public boolean isEmpty();
}
