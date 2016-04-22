package exercise3;

/**
 *
 * @author robert
 */
public class Project implements Cloneable {

    private String archive;

    public Project() {
    }

    public Project(String archive) {
        this.archive = archive;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public Project clone() {
        return new Project(archive);
    }

    @Override
    public String toString() {
        return "Project{" + "archive=" + archive + '}';
    }

}
