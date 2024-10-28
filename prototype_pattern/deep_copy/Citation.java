package prototype_pattern.deep_copy;

public class Citation implements Cloneable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        Citation citation = (Citation) super.clone();
        citation.setStu(citation.getStu().clone());
        return citation;
    }

    public void show() {
        System.out.println(stu.getName() + "同学是三好学生");
    }
}
