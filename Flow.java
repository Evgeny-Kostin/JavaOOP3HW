import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий
 * интерфейс Iterable;
 */
public class Flow implements Iterable<StudyGroup> {

    private List<StudyGroup> flow;

    public Flow() {
        flow = new ArrayList<>();

    }

    public void addListStudyGroup(StudyGroup group) {
        flow.add(group);
    }

    public int sizeListStudyGroup() {
        return flow.size();
    }

    @Override
    public Iterator <StudyGroup> iterator() {

        return flow.iterator();
    }
}