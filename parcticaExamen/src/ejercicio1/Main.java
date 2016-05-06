package ejercicio1;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Component a1 = new Archivo(crearFecha(2016, 6, 23), 3, "jazz pop");
        Component a2 = new Archivo(crearFecha(2016, 11, 23), 2, "rock");
        Component a3 = new Archivo(crearFecha(2016, 11, 23), 1, "notas de clase");
        Component a4 = new Archivo(crearFecha(2016, 1, 23), 4, "universidad");
        Component a5 = new Archivo(crearFecha(2016, 6, 23), 5, "capitulos");
        Component a6 = new Archivo(crearFecha(2016, 6, 23), 6, "libros");

        Component c1 = new Carpeta(crearFecha(2016, 8, 23), 5, "Música");
        Component c2 = new Carpeta(crearFecha(2016, 6, 23), 3, "Videos");

        ((Carpeta) c1).agregar(a1);
        ((Carpeta) c1).agregar(a2);
        ((Carpeta) c1).agregar(a3);
        ((Carpeta) c1).agregar(a4);

        ((Carpeta) c2).agregar(a5);
        ((Carpeta) c2).agregar(a6);

        ((Carpeta) c2).agregar(c1);

        System.out.println("cantidad Elementos: " + c1.calcularCantidadElementos());
        System.out.println("cantidad Elementos: " + c2.calcularCantidadElementos());

        ((Carpeta) c2).setStrategy(new CS_OrdenarTipo());
        ((Carpeta) c2).ordenar();
        System.out.println("" + ((Carpeta) c2).imprimir());

//        ((Carpeta) c1).setStrategy(new CS_OrdenarNombre());
//        ((Carpeta) c1).ordenar();
//        System.out.println("" + ((Carpeta) c1).imprimir());
//
//        ((Carpeta) c1).setStrategy(new CS_OrdenarFecha());
//        ((Carpeta) c1).ordenar();
//        System.out.println("" + ((Carpeta) c1).imprimir());

    }

    public static Date crearFecha(int anno, int mes, int dia) {
        Calendar c = Calendar.getInstance();
        c.set(anno, mes - 1, dia);
        return c.getTime();
    }

}
