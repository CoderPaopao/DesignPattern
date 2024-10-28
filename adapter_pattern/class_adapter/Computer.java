package adapter_pattern.class_adapter;

public class Computer {

    //从SD卡中读数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        return sdCard.readSD();
    }

}
