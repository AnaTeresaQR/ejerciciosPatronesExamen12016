package ejercicio1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Ana Teresa
 */
public class CS_OrdenarTipo implements Strategy_Ordenar {

    @Override
    public SortedSet<Component> ordenar(SortedSet<Component> lista) {
        SortedSet<Component> s = new TreeSet<>(new OrdenarTipo());
        Iterator<Component> it = lista.iterator();

        s.addAll(lista);
        return s;
    }

    private class OrdenarTipo implements Comparator<Component> {

        @Override
        public int compare(Component o1, Component o2) {
            return new Integer(o1.getTipo()).compareTo(o2.getTipo());
        }

    }
}
