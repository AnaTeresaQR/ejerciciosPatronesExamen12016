package exercise3;

/**
 *
 * @author robert
 */
public class OriginatorProject {

    private Project project;

    public OriginatorProject() {

    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setMemento(Object p) {
        if (p instanceof MementoProject) {
            MementoProject saveProject = (MementoProject) p;
            project = saveProject.projectSaved;
        }
    }

    public Object getMementoProject(Project project) {
        return new MementoProject(project);
    }

    private class MementoProject {

        private Project projectSaved;

        public MementoProject(Project project) {
            projectSaved = project.clone();
        }

    }

}
