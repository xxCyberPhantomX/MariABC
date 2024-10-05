package proyect.producto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        
        // Crear e insertar un nuevo producto
        Producto nuevoProducto = new Producto("Galletas", 2.5);
        productoDAO.insertarProducto(nuevoProducto);
        
        // Leer y mostrar todos los productos
        List<Producto> productos = productoDAO.obtenerProductos();
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }

        // Actualizar un producto (supongamos que actualizamos el primero de la lista)
        if (!productos.isEmpty()) {
            nuevoProducto.setPrecio(3.0); // Cambia el precio
            productoDAO.actualizarProducto(nuevoProducto);
        }
        
        // Eliminar un producto (supongamos que eliminamos el primero de la lista)
        if (!productos.isEmpty()) {
            productoDAO.eliminarProducto(nuevoProducto.getId());
        }
    }
}
