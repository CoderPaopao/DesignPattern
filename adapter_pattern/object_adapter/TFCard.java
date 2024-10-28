package adapter_pattern.object_adapter;

public interface TFCard {

    //从TF卡中读数据
    String readTF();
    //从TF卡中写数据
    void writeTF(String msg);

}
