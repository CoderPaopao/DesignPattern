package bridge_pattern;

public class Client {

    public static void main(String[] args) {

        OperatingSystem system = new Mac(new AviFile());
        //使用操作系统播放视频文件
        system.play("战狼三");

    }

}
