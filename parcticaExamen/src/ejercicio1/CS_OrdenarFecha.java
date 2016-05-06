package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Ana Teresa
 */
public class CS_OrdenarFecha implements Strategy_Ordenar {

    @Override
    public SortedSet<Component> ordenar(SortedSet<Component> lista) {
        SortedSet<Component> s = new TreeSet<>(new OrdenarFecha());
        s.addAll(lista);
        return s;
    }

    private class OrdenarFecha implements Comparator<Component> {

        @Override
        public int compare(Component o1, Component o2) {
            return o1.getFecha().compareTo(o2.getFecha());
        }

    }

}
