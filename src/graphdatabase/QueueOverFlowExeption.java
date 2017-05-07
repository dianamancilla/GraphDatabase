
package graphdatabase;

@SuppressWarnings("serial")
public class QueueOverFlowExeption extends RuntimeException {

	public QueueOverFlowExeption(){
		super();
	}
	
	public QueueOverFlowExeption(String message){
		super(message);
	}
}
