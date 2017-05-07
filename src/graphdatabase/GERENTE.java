
package graphdatabase;

public class GERENTE extends SUCURSAL{

	String name;
	String identifier;
	SUCURSAL sucursal;
	
	public GERENTE(String name, String id, SUCURSAL sucursal){
		this.name = name;
		this.identifier = id;
		this.sucursal = sucursal;
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
		return("GERENTE " + dme + this.name + " | ID: " + this.identifier + "\n");
	}

}
