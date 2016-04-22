package exercise7;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class ConcreteBuilderProfesorInterino {

    ProfesorInterino profInterino;

    public ConcreteBuilderProfesorInterino() {

    }

    public void createProf() {
        profInterino = new ProfesorInterino();
    }

    public void createFechaIn_Fin(Date fechaIn, Date fechaFin) throws ExcepcionPersonalizada {
        if (fechaIn.after(fechaIn)) {
            profInterino.setFechainicio(fechaIn);
            profInterino.setFechaFin(fechaFin);
        } else {
            throw new ExcepcionPersonalizada("Las fecha no son correctas");
        }
    }
    
    

    private boolean createPerson(Persona person) throws ExcepcionPersonalizada {
        if (person == null) {
            throw new ExcepcionPersonalizada("La persona no puede ser creada porque no existe");
        } else {
            String name = person.getNombre();
            int edad = person.getEdad();

            if ((name != null && !name.equals(""))
                    && edad != 0) {
                return true;
            } else {
                throw new ExcepcionPersonalizada("La personas no puede ser creada");
            }
        }
    }

}
