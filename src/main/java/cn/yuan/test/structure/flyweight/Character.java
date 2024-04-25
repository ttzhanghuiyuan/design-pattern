package cn.yuan.test.structure.flyweight;

import java.awt.Color;

/**
 * 享元接口
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 14:47:53
 */
public interface Character {
    void setColor(Color color);
    void setFont(String font);
    void display();
}
