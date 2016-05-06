package ejercicio1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public abstract class Component implements Comparable {

    private Date fecha;
    private int tipo;
    private String nombre;

    public Component(Date fecha, int tipo, String nombre) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public abstract int calcularCantidadElementos();

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object o) {
        return ((Component) o).getNombre().compareTo(nombre);
    }

    @Override
    public String toString() {
        return "Component{" + "fecha=" + fecha.toLocaleString() + ", tipo=" + tipo + ", nombre=" + nombre + '}';
    }

}
