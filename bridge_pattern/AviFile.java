package bridge_pattern;

/**
 * avi视频文件类（具体实现化角色）
 */

public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
