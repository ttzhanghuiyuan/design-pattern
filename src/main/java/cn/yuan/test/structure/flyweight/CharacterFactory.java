package cn.yuan.test.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public Character getCharacter(char character)
    {
        ConcreteCharacter concreteCharacter = characters.get(character);
        if(concreteCharacter == null){
            concreteCharacter = new ConcreteCharacter(character);
            characters.put(character, concreteCharacter);
        }
        return concreteCharacter;
    }
}
