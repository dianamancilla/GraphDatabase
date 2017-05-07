
package graphdatabase;

public class SUCURSAL {

	public String name;
	public String identifier;

	public SUCURSAL(String name, String id){
		this.name = name;
		this.identifier = id;
	}

	public SUCURSAL(){
		this("New SUC", "N-SUC");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public String toString(){
		String dme = "";
		return("SUCURSAL " + dme + this.name + " | ID: " + this.identifier + "\n");
	}

}
