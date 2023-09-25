import java.util.ArrayList;
import java.util.List;

public class RecomendacionProductos {
    private List<Producto> productos;

    public RecomendacionProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> recomendarProductos(String nombreProducto) {
        List<Producto> productosRecomendados = new ArrayList<>();



        for (Producto producto : productos) {
            if (!producto.getNombre().equals(nombreProducto) && producto.getCategoria().equals("Electrónica")) {
                productosRecomendados.add(producto);
            }
        }

        return productosRecomendados;
    }

    public static void main(String[] args) {

        Producto producto1 = new Producto("Producto A", "Electrónica");
        Producto producto2 = new Producto("Producto B", "Ropa");
        Producto producto3 = new Producto("Producto C", "Electrónica");
        Producto producto4 = new Producto("Producto D", "Electrónica");

        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        String productoReferencia = "Producto A";
        RecomendacionProductos recomendacion = new RecomendacionProductos(listaProductos);

        List<Producto> recomendaciones = recomendacion.recomendarProductos(productoReferencia);

        System.out.println( "Brayam Edwin Quispe Apaza");
        System.out.println("Productos recomendados para " + productoReferencia + ":");
        for (Producto recomendado : recomendaciones) {
            System.out.println(recomendado.getNombre());
        }
    }
}
