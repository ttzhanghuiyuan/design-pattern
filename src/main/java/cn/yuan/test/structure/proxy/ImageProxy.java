package cn.yuan.test.structure.proxy;

/**
 * 代理
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 10:48:03
 */
public class ImageProxy implements Image{
    private RealImage realImage;

    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
