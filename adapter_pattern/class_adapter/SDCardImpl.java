package adapter_pattern.class_adapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SD:Hello World";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println(msg);
    }
}
