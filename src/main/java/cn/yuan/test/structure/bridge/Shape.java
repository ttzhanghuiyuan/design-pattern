package cn.yuan.test.structure.bridge;

/**
 * 抽象部分
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 11:01:09
 */
abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract void draw();
}
