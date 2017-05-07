
package graphdatabase;

public class CLIENTE extends SUCURSAL{

	String name;
	String identifier;
	EMPLEADO empleado;
	
	public CLIENTE(String name, String id, EMPLEADO empleado){
		this.name = name;
		this.identifier = id;
		this.empleado = empleado;
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
		return("CLIENTE " + dme + this.name + " | ID: " + this.identifier + "\n");
	}

}
