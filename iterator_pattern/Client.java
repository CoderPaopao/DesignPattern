package iterator_pattern;

public class Client {

    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        //添加元素
        studentAggregate.add(new Student("张三","001"));
        studentAggregate.add(new Student("李四","002"));
        studentAggregate.add(new Student("王五","003"));
        studentAggregate.add(new Student("赵六","004"));

        //遍历聚合对象

        //获取迭代器对象
        StudentIterator iterator = studentAggregate.getStudentIterator();
        //遍历
        while (iterator.hasNext()) {
            //获取元素
            Student student = iterator.next();
            System.out.println(student.toString());
        }
    }

}
