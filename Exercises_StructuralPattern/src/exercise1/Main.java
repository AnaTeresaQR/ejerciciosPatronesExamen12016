package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        // se crea una computadora NO decorada y se imprimen sus datos
        ComponentComputer c1 = new Computer("Hp Pavilon");

        System.out.println("Compu 1: \n" + c1.getDescripcion() + " \nPrecio: " + c1.getPrecio());

        //-------------------------------------------------------------------------------------------------------
        // se crea una computadora decorada con sus nuevos componentes y se imprimen sus datos
        ComponentComputer c2 = new Computer("Toshiba C45");
        c2 = new SdCardReader(c2, "Kingston 4 gb"); // se añaden componentes como decoración
        c2 = new DVDburner_BluRay(c2, "Ridata 25gb");
        c2 = new WebCam(c2, "Logitech C270");

        System.out.println("\nCompu 2 todos los componentes: \n" + c2.getDescripcion() + " \nPrecio: " + c2.getPrecio());

    }

}
