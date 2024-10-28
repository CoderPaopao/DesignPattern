package iterator_pattern;

/**
 * 抽象聚合角色类
 */

public interface StudentAggregate {

    //添加学生
    void add(Student student);
    //删除学生
    void remove(Student student);
    //获取迭代器
    StudentIterator getStudentIterator();
}
