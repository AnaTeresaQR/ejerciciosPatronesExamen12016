package exercise7;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class EstudianteConvenio extends Estudiantes {

    private String instProviene;
    private ArrayList<String> cursosConvalidados;

    public EstudianteConvenio() {
    }

    public EstudianteConvenio(String nombre, int edad, String carrera, String carné, String instProviene, ArrayList<String> cursosConvalidados) {
        super(nombre, edad, carrera, carné);
        this.instProviene = instProviene;
        this.cursosConvalidados = cursosConvalidados;
    }

    public void setInstProviene(String instProviene) {
        this.instProviene = instProviene;
    }

    public String getInstProviene() {
        return instProviene;
    }

    public String getCursosConvalidados() {
        String text = "";
        for (String cursos : cursosConvalidados) {
            text += " , " + cursos;
        }
        return text;
    }

    @Override
    public String toString() {
        return "EstudianteBecado{" + super.toString() + "instProviene=" + instProviene + ", pagoTipobeca=" + getCursosConvalidados() + '}';
    }

}
