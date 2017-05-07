
package graphdatabase;

public interface UnboundedQueueInterface<Type> extends QueueInterface<Type> {

	public void enqueue(Type element);
}
