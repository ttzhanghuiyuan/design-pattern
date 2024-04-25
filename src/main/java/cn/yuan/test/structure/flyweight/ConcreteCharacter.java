package cn.yuan.test.structure.flyweight;

import java.awt.Color;

/**
 * 具体享元
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 14:48:44
 */
public class ConcreteCharacter implements Character {
    private char character;
    private Color color;
    private String font;

    public ConcreteCharacter(char character){
        this.character = character;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setFont(String font) {
        this.font = font;
    }

    @Override
    public void display() {
        System.out.println("character:" + character + " color:" + color + " font:" + font);
    }
}
