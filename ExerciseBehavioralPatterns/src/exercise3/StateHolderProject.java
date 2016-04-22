package exercise3;

import java.util.ArrayList;

/**
 *
 * @author robert
 */
public class StateHolderProject {

    ArrayList projectLists = new ArrayList();

    public void addProjectMemento(Object project) {
        projectLists.add(project);
    }

    public Object removeProjectMemento() {
        return projectLists.remove(projectLists.size() - 1);
    }
}
