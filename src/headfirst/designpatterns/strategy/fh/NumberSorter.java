package headfirst.designpatterns.strategy.fh;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSorter implements Sorter {

    @Override
    public List<Student> sort(List<Student> list) {
        Collections.sort(list, Comparator.comparing(Student::getMatriculationNumber));
        return list;
    }
}
