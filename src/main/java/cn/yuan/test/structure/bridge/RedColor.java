package cn.yuan.test.structure.bridge;

/**
 * 具体实现部分
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 10:59:42
 */
public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
