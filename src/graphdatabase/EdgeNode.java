
package graphdatabase;

	
	public class EdgeNode<T> {
	
		private int weight;
		private int indexOfVertex;
		private EdgeNode<T> link;
	
		public int getWeight() {
			return weight;
		}
	
		public void setWeight(int weight) {
			this.weight = weight;
		}
	
		public EdgeNode<T> getLink() {
			return this.link;
		}
	
		public void setLink(EdgeNode<T> link) {
			this.link = link;
		}
	
		public int getAdjVertex(){
			return this.indexOfVertex;
		}
	
		public EdgeNode(int vertexNum, int weight, EdgeNode<T> link){
			this.indexOfVertex = vertexNum;
			this.setWeight(weight);
			this.link = link;
		}
	}
