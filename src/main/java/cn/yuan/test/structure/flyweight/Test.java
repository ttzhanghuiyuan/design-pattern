package cn.yuan.test.structure.flyweight;

import java.awt.Color;

public class Test {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character characterA = characterFactory.getCharacter('A');
        characterA.setColor(Color.RED);
        characterA.setFont("Arial");
        characterA.display();

        Character characterB = characterFactory.getCharacter('B');
        characterB.setColor(Color.BLUE);
        characterB.setFont("Times New Roman");
        characterB.display();
    }
}
