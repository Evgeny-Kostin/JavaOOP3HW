//Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow flow1, Flow flow2) {
        return Integer.compare(flow1.sizeListStudyGroup(), flow2.sizeListStudyGroup());
    }
}
