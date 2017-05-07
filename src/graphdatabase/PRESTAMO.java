
package graphdatabase;
public class PRESTAMO extends SUCURSAL{

	String folio;
	String identifier;
	CLIENTE cliente;
	
	public PRESTAMO(String name, String id, CLIENTE cliente){
		this.name = name;
		this.identifier = id;
		this.cliente = cliente;
	}
	

	public String getName() {
		return folio;
	}
	public void setName(String name) {
		this.folio = name;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public String toString(){
		String dme = "";
		return("FOLIO " + dme + this.name + " | ID: " + this.identifier + "\n");
	}

}