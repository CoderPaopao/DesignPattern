package template_method_pattern;

public class Client {

    public static void main(String[] args) {
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();
    }
}
