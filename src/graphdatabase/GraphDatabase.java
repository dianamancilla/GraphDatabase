/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphdatabase;

/**
 *
 * @author davidcabello
 */
import javax.swing.JFrame;

public class GraphDatabase extends JFrame {
    
    public GraphDatabase (){ 
        interfaz i = new interfaz();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        i.setResizable(false);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public static void main(String[] args){
            GraphDatabase Programa = new GraphDatabase();
		
	}

	public static boolean isPath(DirWeightGraph<SUCURSAL> graph, SUCURSAL startVertex, SUCURSAL endVertex){
		LinkedStack<SUCURSAL> stack = new LinkedStack<SUCURSAL>();
		LinkedQueue<SUCURSAL> queue = new LinkedQueue<SUCURSAL>();
		SUCURSAL vertex;
		SUCURSAL item;

		boolean found = false;
		graph.clearMarks();
		stack.push(startVertex);
		do{
			vertex = stack.top();
			stack.pop();
			if(vertex == endVertex){
				found = true;
			}else{
				if(!graph.isMarked(vertex)){
					graph.markVertex(vertex);
					queue = graph.getToVertices(vertex);

					while(!queue.isEmpty()){
						item = queue.dequeue();
						if(!graph.isMarked(item)){
							stack.push(item);
						}
					}
				}
			}
		}while(!stack.isEmpty() && !found);

		return found;
	}

	public static boolean isPath2(DirWeightGraph<SUCURSAL> graph, SUCURSAL startVertex, SUCURSAL endVertex){
		LinkedQueue<SUCURSAL> auxQueue = new LinkedQueue<SUCURSAL>();
		LinkedQueue<SUCURSAL> queue = new LinkedQueue<SUCURSAL>();

		boolean found = false;
		SUCURSAL vertex;
		SUCURSAL element;

		graph.clearMarks();
		auxQueue.enqueue(startVertex);
		do{
			vertex = auxQueue.dequeue();
			if(vertex == endVertex){
				found = true;
			}else{
				if(!graph.isMarked(vertex)){
					graph.markVertex(vertex);
					queue = graph.getToVertices(vertex);

					while(!queue.isEmpty()){
						element = queue.dequeue();
						if(!graph.isMarked(element)){
							auxQueue.enqueue(element);
						}
					}
				}
			}
		}while(!found && !auxQueue.isEmpty());

		return found;
	}

}

