
package graphdatabase;

public class EMPLEADO extends SUCURSAL{
	String name;
	String identifier;
	GERENTE gerente;
	
	public EMPLEADO(String name, String id, GERENTE gerente){
		this.name = name;
		this.identifier = id;
		this.gerente = gerente;
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
		return("EMPLEADO " + dme + this.name + " | ID: " + this.identifier + "\n");
	}

}
