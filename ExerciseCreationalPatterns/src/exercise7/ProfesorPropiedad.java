package exercise7;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class ProfesorPropiedad extends Profesores {

    private Date fechainicio;
    private int tiempoQueLabora;
    private double pago;

    public ProfesorPropiedad() {
    }

    public ProfesorPropiedad(String nombre, int edad, String cargo, Date fechainicio, int tiempoQueLabora, double pago) {
        super(nombre, edad, cargo);
        this.fechainicio = fechainicio;
        this.tiempoQueLabora = tiempoQueLabora;
        this.pago = pago;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public int getTiempoQueLabora() {
        return tiempoQueLabora;
    }

    public void setTiempoQueLabora(int tiempoQueLabora) {
        this.tiempoQueLabora = tiempoQueLabora;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "ProfesorPropiedad{" + super.toString() + "fechainicio=" + fechainicio + ", tiempoQueLabora=" + tiempoQueLabora + ", pago=" + pago + '}';
    }
}
