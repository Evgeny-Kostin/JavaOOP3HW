//Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;

import java.util.List;

public class FlowService {

    public List<Flow> StreamComparator(List<Flow> flow) {
        flow.sort(new StreamComparator());
        return flow;
    }
}
/*
 publis void sortFlow(List <Flow> flow) {
 StreamComparator sortFlow = new StreamComparator ();
 flow.sort(sortFlow);
 }
   }
 */