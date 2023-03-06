/* --------------------------------------------------------------------------
 * APUNTES:
 * 		   Las interfaces son contratos donde se establecen los métodos que
 *		   las clases que la implementen deberán incluir, como si de un contrato
 *		   se tratase.
 *
 *
 * IMPORTANTE:
 *  			  - Se recomienda utilizar puras mayúsculas al nombrar los
 *					atributos de las interfaces. Además, estos deben tener
 *					asignado un valor.
 *  			  - Los métodos de las interfaces tendrán que ser incluidos,
 *					obligatoriamente, por las clases que hagan uso de está.
-------------------------------------------------------------------------- */
package lessons.interfaces;

public interface IDataBase {
	int MAX_DATA = 10;

	void list();
	void insert();
	void delete();
	void update();
}
