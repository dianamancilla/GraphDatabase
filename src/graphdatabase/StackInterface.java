
package graphdatabase;

public interface StackInterface<Type> {
	
	public void pop() throws StackUnderFlowException;
	
	public Type top() throws StackUnderFlowException;

	public boolean isEmpty();
}
