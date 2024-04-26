package cn.yuan.test.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:57:30
 */
public class Website {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element){
        elements.add(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }

    }
}
