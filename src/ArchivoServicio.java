import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoServicio {
	ProductoServicio Ps = new ProductoServicio();
	Scanner sc = new Scanner(System.in);
	Producto P = new Producto();


	public void cargarDatos() throws IOException {
		String csvFile = "src/ProductosImportados.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {
			// Recorremos cada linea y separamos con un split segun la coma
			String[] datos = line.split(cvsSplitBy);
			
			// Agregamos los productos al Arraylist
			Ps.agregarProducto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
			
		}
		System.out.println("Datos cargados correctamente en la lista");
	}

	public void ListarPrd() {
		Ps.listaProductos();
	}

	public void editarProducto() {
		// Validamos si existe data en el listArray
		if (Ps.listaProductos.size() > 0) {
			int index = -1;
			System.out.println("Ingrese un numero del 1 al 8 para editar uno de los productos");
			int numero = sc.nextInt();
			if (numero < 0 || numero > 8) {
				System.out.println("Ingrese un numero valido del 1 al 8");
			} else {
				System.out.println("Ingrese el codigo del producto asociado a la opción ingresada");
				int codigo = sc.nextInt();
				index = Ps.buscarProducto(codigo, numero);
				if (index != -1) {
					System.out.println("Ingrese la opción a editar de los datos del producto");
					int opc = sc.nextInt();
					Ps.editarProducto(opc, index);
				} 

			}
		} else {
			System.out.println("No se encontraron productos para editar");

		}
	}
}
