package adapter_pattern.object_adapter;

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg = "TF:Hello World!";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println(msg);
    }
}
