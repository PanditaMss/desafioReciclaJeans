import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
	Scanner sc = new Scanner(System.in);

	public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public ProductoServicio(ArrayList<Producto> list) {
		super();
		this.listaProductos = list;
	}

	public ProductoServicio() {
		super();
	}

	public ArrayList<Producto> getList() {
		return listaProductos;
	}

	public void setList(ArrayList<Producto> list) {
		this.listaProductos = list;
	}

	public void listaProductos() {
		System.out.println("\n\n\n\n\n");
		if (listaProductos.size() > 0) {
			System.out.println("Datos del producto: ");
			for (int i = 0; i < listaProductos.size(); i++) {
				System.out.println("\nNombre articulo: " + listaProductos.get(i).getArticulo());
				System.out.println("Código: " + listaProductos.get(i).getCodigo());
				System.out.println("Marca: " + listaProductos.get(i).getMarca());
				System.out.println("Color: " + listaProductos.get(i).getColor());
				System.out.println("Descripción: " + listaProductos.get(i).getDescripcion());
				System.out.println("Precio: " + listaProductos.get(i).getPrecio());
				System.out.println("Talla: " + listaProductos.get(i).getTalla());
			}
		} else {
			System.out.println("No se encontraron productos en la tienda");
		}

	}

	public ArrayList<Producto> getListaProductos() {

		return listaProductos;
	}

	public void agregarProducto(String articulo, String precio, String descripcion, String codigo, String talla,
			String marca, String color) {
		Producto prd = new Producto();
		prd.setArticulo(articulo);
		prd.setPrecio(Integer.parseInt(precio));
		prd.setDescripcion(descripcion);
		prd.setCodigo(Integer.parseInt(codigo));
		prd.setTalla(talla);
		prd.setColor(color);
		prd.setMarca(marca);
		System.out.println(prd.toString());
		listaProductos.add(prd);

	}

	public void editarProducto(int opcion, int index) {
		try {
			if (opcion == 1) {
				System.out.println("Ingrese el nuevo nombre del producto");
				String nombreArtNew = sc.nextLine();
				listaProductos.get(index).setArticulo(nombreArtNew);
			} else if (opcion == 2) {
				System.out.println("Ingrese el nuevo codigo del producto");
				int codigoNuevo = sc.nextInt();
				sc.nextLine();
				listaProductos.get(index).setCodigo(codigoNuevo);
			} else if (opcion == 3) {
				System.out.println("Ingrese el nuevo color del producto");
				String colorNuevo = sc.nextLine();
				listaProductos.get(index).setColor(colorNuevo);
			} else if (opcion == 4) {
				System.out.println("Ingrese la nueva descripción del producto");
				String descripcionNueva = sc.nextLine();
				listaProductos.get(index).setDescripcion(descripcionNueva);
			} else if (opcion == 5) {
				System.out.println("Ingrese la nueva marca del producto");
				String marcaNueva = sc.nextLine();
				listaProductos.get(index).setMarca(marcaNueva);
			} else if (opcion == 6) {
				System.out.println("Ingrese el nuevo precio del producto");
				int precioNuevo = sc.nextInt();
				sc.nextLine();
				listaProductos.get(index).setPrecio(precioNuevo);
			} else if (opcion == 7) {
				System.out.println("Ingrese la nueva talla del producto");
				String tallaNueva = sc.nextLine();
				listaProductos.get(index).setTalla(tallaNueva);
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error: " + e.getMessage());
		}

	}

	public int buscarProducto(int codigo, int numero) {
		// Buscamos el producto para visualizarlo por pantalla
		int indexPrd = -1;

		if (listaProductos.get(numero - 1).getCodigo() == codigo) {
			indexPrd = numero - 1;
		}

		if (indexPrd != -1) {
			System.out.println("1.-El nombre del articulo actual es: " + listaProductos.get(indexPrd).getArticulo());
			System.out.println("2.-El código del producto: " + listaProductos.get(indexPrd).getCodigo());
			System.out.println("3.-El color del producto: " + listaProductos.get(indexPrd).getColor());
			System.out.println("4.-La descripción del producto: " + listaProductos.get(indexPrd).getDescripcion());
			System.out.println("5.-La marca del producto: " + listaProductos.get(indexPrd).getMarca());
			System.out.println("6.-El precio del producto: " + listaProductos.get(indexPrd).getPrecio());
			System.out.println("7.-La talla del producto: " + listaProductos.get(indexPrd).getTalla());
		} else {
			System.out.println("No se ha encontrado el producto");
		}
		return indexPrd;
	}

}
