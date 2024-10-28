package prototype_pattern.example;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();

//        citation.setName("张三");
//        citation2.setName("李四");
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        Citation citation2 = citation.clone();
        citation2.getStu().setName("李四");

        citation.show();
        citation2.show();
    }
}
