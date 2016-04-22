package exercise7;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class ProfesorInterino extends Profesores {

    private Date fechainicio;
    private Date fechaFin;
    private int tiempoQueLabora;
    private double pago;

    public ProfesorInterino() {

    }

    public ProfesorInterino(String nombre, int edad, String cargo, Date fechainicio, Date fechaFin, int tiempoQueLabora, double pago) {
        super(nombre, edad, cargo);
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
        this.tiempoQueLabora = tiempoQueLabora;
        this.pago = pago;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
        return "ProfesorInterino{" + super.toString() + "fechainicio=" + fechainicio + ", fechaFin=" + fechaFin + ", tiempoQueLabora=" + tiempoQueLabora + ", pago=" + pago + '}';
    }

}
