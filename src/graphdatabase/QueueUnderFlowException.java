
package graphdatabase;

@SuppressWarnings("serial")
public class QueueUnderFlowException extends RuntimeException {

	public QueueUnderFlowException(){
		super();
	}
	
	public QueueUnderFlowException(String message){
		super(message);
	}
	
}
