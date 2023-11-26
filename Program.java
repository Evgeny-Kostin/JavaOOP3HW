/*
— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
— Модифицировать класс Контроллер, добавив в него созданный сервис;
— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
 */

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        StudyGroup group1StudyGroup = new StudyGroup("AS97");
        StudyGroup group2StudyGroup = new StudyGroup("zT97");
        StudyGroup group3StudyGroup = new StudyGroup("OOP23");
        StudyGroup group4StudyGroup = new StudyGroup("IT23");
        Flow flow1 = new Flow();
        Flow flow2 = new Flow();
        flow1.addListStudyGroup(group1StudyGroup);
        flow2.addListStudyGroup(group4StudyGroup);
        flow1.addListStudyGroup(group2StudyGroup);
        flow2.addListStudyGroup(group3StudyGroup);
        List<Flow> flow = new ArrayList<>();
        flow.add(flow1);
        flow.add(flow2);
        System.out.println("По кол-ву групп:");
        FlowService flowService = new FlowService();
        flowService.StreamComparator(flow);
        for(Flow itemFlow: flow) {
            System.out.println("Поток - "+ itemFlow.sizeListStudyGroup());
            for(StudyGroup group: itemFlow){
                System.out.println(group.getnumberGroup());
            }
        }
    
    }
}