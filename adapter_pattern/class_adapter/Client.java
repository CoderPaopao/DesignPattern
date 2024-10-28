package adapter_pattern.class_adapter;

public class Client {

    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        //使用电脑读取TF卡数据
        //定义适配器
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);

    }

}
