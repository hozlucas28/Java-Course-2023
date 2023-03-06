/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las enumeraciones complejas poseen elementos que almacenan datos.
 *
 *
 * IMPORTANTE:
 *  			  - Los datos de las enumeraciones complejas son inmutables,
 *					es decir, son constantes.
 *  			  - En en caso de las enumeraciones complejas es necesario
 *					crear un constructor y un getter, para obtener el dato
 *					que almacena cada elemento de la enumeración.
-------------------------------------------------------------------------- */

package lessons.enumerations;

public enum Continents {
	// Elementos
	ASIA(48),
	EUROPE(50),
	AFRICA(54),
	AMERICA(35),
	OCEANIA(14);

	private final int nCountries;

	// Constructor
	private Continents(int nCountries) {
		this.nCountries = nCountries;
	}

	// Getters
	public int getCountries() {
		return this.nCountries;
	}
}
