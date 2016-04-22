package exercise7;

/**
 *
 * @author Ana Teresa
 */
public class EstudianteBecado extends Estudiantes {

    private int numBeca;
    private int pagoTipobeca;

    public EstudianteBecado() {
    }

    public EstudianteBecado(String nombre, int edad, String carrera, String carné, int numBeca, int pagoTipobeca) {
        super(nombre, edad, carrera, carné);
        this.numBeca = numBeca;
        this.pagoTipobeca = pagoTipobeca;
    }

    public int getNumBeca() {
        return numBeca;
    }

    public void setNumBeca(int numBeca) {
        this.numBeca = numBeca;
    }

    public int getPagoTipobeca() {
        return pagoTipobeca;
    }

    public void setPagoTipobeca(int pagoTipobeca) {
        this.pagoTipobeca = pagoTipobeca;
    }

    @Override
    public String toString() {
        return "EstudianteBecado{" + super.toString() + "numBeca=" + numBeca + ", pagoTipobeca=" + pagoTipobeca + '}';
    }

}
