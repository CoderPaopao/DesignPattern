package prototype_pattern.example;

public class Citation implements Cloneable {

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

//    public void show() {
//        System.out.println(this.name + "同学是三好学生");
//    }

    public void show() {
        System.out.println(stu.getName() + "同学是三好学生");
    }
}
