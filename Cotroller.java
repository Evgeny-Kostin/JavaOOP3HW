/*— Модифицировать класс Контроллер, добавив в него созданный сервис;
— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, 
путём вызова созданного сервиса.
*/

import java.util.List;

public class Cotroller {
    private FlowService flowService;

    public Cotroller(FlowService flowService) {
        this.flowService = flowService;

    }

    public List<Flow> StreamComparator(List<Flow> flow) {
        flow.sort(new StreamComparator());
        return flow;
    }
}
