import java.util.ArrayList;

public class BuildOrder {
    static int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
        for (Project project : projects) {
            if (project.getNumberDependencies() == 0) {
                order[offset] = project;
                offset++;
            }
        }
        return offset;
    }

    static Project[] orderProjects(ArrayList<Project> projects) {
        Project[] order = new Project[projects.size()];
        int endOfList = addNonDependent(order, projects, 0);
        int toBeProcessed = 0;
        while (toBeProcessed < order.length) {
            Project current = order[toBeProcessed];
            if (current == null)
                return null;
            ArrayList<Project> children = current.getChildren();
            for (Project child : children) {
                child.decrementDependencies();
            }
            endOfList = addNonDependent(order, projects, endOfList);
            toBeProcessed++;
        }
        return order;
    }

}
