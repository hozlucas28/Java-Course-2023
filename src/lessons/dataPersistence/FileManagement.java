/* --------------------------------------------------------------------------
 * IMPORTANTE:
 *  			  - El archivo no se creara si ya existe.
 *  			  - Al terminar de operar sobre un archivo, dicha operación
 *					debe cerrarse.
-------------------------------------------------------------------------- */

package lessons.dataPersistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManagement {

	public static void main(String[] args) {
		createFile("src\\lessons\\dataPersistence\\files\\test.txt"); // Dirección relativa.
		// createFile("C:\\Users\\hozlu\\Desktop\\test.txt"); // Dirección Absoluta.

		writeFile("src\\lessons\\dataPersistence\\files\\test.txt", "¡Hola desde Java!");
		writeFile("src\\lessons\\dataPersistence\\files\\test.txt", "¿Cómo estas?");

		readFile("src\\lessons\\dataPersistence\\files\\test.txt");

		deleteFile("src\\lessons\\dataPersistence\\files\\test.txt");
	}

	// Crear archivo
	public static void createFile(String fName) {
		File file = new File(fName); // Abrir archivo.

		try {
			PrintWriter pw = new PrintWriter(file); // Iniciar escritura - Archivo se crea y reinicia contenido.
			pw.close(); // Cerrar escritura.
			System.out.println("¡Archivo creado con éxito!");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}

	// Escribir archivo
	public static void writeFile(String fName, String content) {
		File file = new File(fName); // Abrir archivo.

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file, true)); // Iniciar escritura - Archivo no reinicia contenido.
			pw.println(content); // Escribir archivo.
			pw.close(); // Cerrar escritura.
			System.out.println("¡Se ha escrito el archivo con éxito!");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

	// Leer archivo
	public static void readFile(String fName) {
		File file = new File(fName); // Abrir archivo.

		try {
			BufferedReader br = new BufferedReader(new FileReader(file)); // Iniciar lectura.
			String lecture = br.readLine(); // Leer primera línea.

			// Leer hasta la ultima línea
			while (lecture != null) {
				System.out.println(lecture);
				lecture = br.readLine();
			}
			br.close(); // Cerrar lectura.
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

	// Eliminar archivo
	public static void deleteFile(String fName) {
		File file = new File(fName); // Abrir archivo.

		System.out.println(file.exists()); // Verificar si el archivo existe.
		file.delete(); // Eliminar archivo.
		System.out.println("¡Se elimino el archivo con éxito!");
		System.out.println(file.exists());
	}
}
