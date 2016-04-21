package exercise1;

/**
 * Clase abstracta que se encarga del manejo de los componentes, por medio de
 * esta se añaden objetos decorados
 *
 * @author Ana Teresa
 */
public abstract class ComputerDecorator implements ComponentComputer {

    ComponentComputer component; // atributo general, referencia a la interfaz

    // recibe la clase a instanciar para decorar la computadora básica (NO decorada)
    public ComputerDecorator(ComponentComputer component) {
        this.component = component;
    }

    public ComponentComputer getComponent() {
        return component;
    }

    public void setComponent(ComponentComputer component) {
        this.component = component;
    }

}
