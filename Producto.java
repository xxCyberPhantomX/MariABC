package proyect.producto;

import javax.persistence.*;

@Entity
@Table(name = "productos") // Nombre de la tabla en la base de datos
public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el ID automáticamente
    private Long id;

    @Column(name = "nombre", nullable = false) // Nombre de la columna en la tabla
    private String nombre;

    @Column(name = "precio", nullable = false) // Nombre de la columna en la tabla
    private double precio;

    // Constructor vacío
    public producto() {
    }

    // Constructor con parámetros
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
