package headfirst.designpatterns.strategy.fh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "a");
        Student student2 = new Student(5, "F");
        Student student3 = new Student(3, "A");
        Student student4 = new Student(8, "g");

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Sorter nameSorter = new NameSorter();
        System.out.println("NameSorter: -> " + nameSorter.sort(studentList));

        Sorter numberSorter = new NumberSorter();
        System.out.println("NumberSorter: -> " + numberSorter.sort(studentList));

    }
}
