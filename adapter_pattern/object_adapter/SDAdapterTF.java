package adapter_pattern.object_adapter;

public class SDAdapterTF implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read TF card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TF card");
        tfCard.writeTF(msg);
    }
}
