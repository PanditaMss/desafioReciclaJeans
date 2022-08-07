
import java.io.IOException;
import java.util.Scanner;

public class Utilidad {
	public void Limpiar() throws IOException, InterruptedException {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println("Error al limpiar la pantalla" + e.getMessage());
		}
	}

	public void TiempoEsperado() throws InterruptedException {
		String seguir;

		Scanner teclado = new Scanner(System.in);

		System.out.println("\nPresione una tecla para continuar...");

		try
		{
			seguir = teclado.nextLine();
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			
		}
		
	}
}
