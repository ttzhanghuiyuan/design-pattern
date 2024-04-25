package cn.yuan.test.structure.proxy;

public class Test {

    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");

        //图像首次加载
        image.display();

        //图像已经加载,直接显示
        image.display();
    }
}
