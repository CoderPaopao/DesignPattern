package bridge_pattern;

/**
 * rmvb视频文件类（具体实现类）
 */

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
