package exercise3;

/**
 *
 * @author robert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StateHolderProject stateHolder = new StateHolderProject();
        OriginatorProject originator = new OriginatorProject();

        Project project1 = new Project("Archivo1");
        //COMMIT
        Project copyProject = project1.clone();
        copyProject.setArchive("Modificacion al archivo");
        copyProject.setArchive("Modificacion 2 al archivo");
        originator.setProject(copyProject);
        stateHolder.addProjectMemento(originator.getMementoProject(copyProject));
        //COMMIT2
        Project copyProject2 = copyProject.clone();
        copyProject2.setArchive("Modificacion 3 al archivo");
        originator.setProject(copyProject2);
        System.out.println(originator.getProject().getArchive());
        stateHolder.addProjectMemento(originator.getMementoProject(copyProject2));
        //COMMIT3
        Project copyProject3 = copyProject.clone();
        copyProject3.setArchive("Modificacion 4 al archivo");
        originator.setProject(copyProject3);
        System.out.println(originator.getProject().getArchive());
        stateHolder.addProjectMemento(originator.getMementoProject(copyProject3));
        //REVERT
        originator.setMemento(stateHolder.removeProjectMemento());
        System.out.println(originator.getProject().getArchive());
        //REVERT
        originator.setMemento(stateHolder.removeProjectMemento());
        System.out.println(originator.getProject().getArchive());

    }

}
