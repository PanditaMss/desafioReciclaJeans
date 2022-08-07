import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		try {
			Scanner sc = new Scanner(System.in);
			ProductoServicio Ps = new ProductoServicio();
			ArchivoServicio ArchServ = new ArchivoServicio();
			Menu mn = new Menu();
			Utilidad ut = new Utilidad();
			int opcion = 0;

			while (opcion < 5) {
				System.out.println("");
				mn.menu();
				opcion = sc.nextInt();
				if (opcion == 1) {
					ArchServ.ListarPrd();
					ut.TiempoEsperado();
					ut.Limpiar();
				} else if (opcion == 2) {
					ArchServ.editarProducto();
					ut.TiempoEsperado();
					ut.Limpiar();
				} else if (opcion == 3) {
					ArchServ.cargarDatos();
					ut.TiempoEsperado();
					ut.Limpiar();
				} else if (opcion == 4) {
					System.out.println("Abandonando el sistema de productos...");
					System.out.println("Acaba de salir del sistema");
					System.exit(0);
				}
			}
		} catch (Exception e) {

			System.out.println("Ha ocurrido un error: " + e.getMessage());
		}

	}

}
