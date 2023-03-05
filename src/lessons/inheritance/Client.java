/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Ejemplo de una clase hija de la clase padre <Person>.
-------------------------------------------------------------------------- */

package lessons.inheritance;

import java.util.Date;

public class Client extends Person {

	// Atributos
	private int ID;
	private Date dateRegister;
	private boolean vip;

	private static int nClients; // Número de clientes.

	// Constructores
	public Client(String name, char gender, int age, String address, Date dateRegister, boolean vip) {
		super(name, gender, age, address);
		this.ID = ++Client.nClients; // ID de tipo AUTO_INCREMENT.
		this.dateRegister = dateRegister;
		this.vip = vip;
	}

	// Getters
	public int getID() {
		return this.ID;
	}

	public Date getDateRegister() {
		return this.dateRegister;
	}

	public boolean isVip() {
		return this.vip;
	}

	// Setters
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	// toString
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [ID=");
		builder.append(ID);
		builder.append(", dateRegister=");
		builder.append(dateRegister);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
