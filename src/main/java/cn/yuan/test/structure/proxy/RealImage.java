package cn.yuan.test.structure.proxy;

/**
 * 真实主题
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 10:48:20
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
