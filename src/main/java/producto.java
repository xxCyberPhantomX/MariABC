import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class producto {
    private int id;
    private String nombre;
    private double precio;

    // Constructor
    public producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para guardar el producto en la base de datos
    public void guardarEnBaseDeDatos() {
        String url = "jdbc:mysql://localhost:3306/tu_basededatos";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            String query = "INSERT INTO productos (id, nombre, precio) VALUES (?, ?, ?)";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, this.id);
            ps.setString(2, this.nombre);
            ps.setDouble(3, this.precio);
            ps.executeUpdate();
            System.out.println("Producto guardado en la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }
    }
}
