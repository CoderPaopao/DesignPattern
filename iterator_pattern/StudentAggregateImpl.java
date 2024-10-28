package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<Student>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
