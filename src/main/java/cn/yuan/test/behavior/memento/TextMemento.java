package cn.yuan.test.behavior.memento;

/**
 * 备忘录模式
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 11:03:48
 */
public class TextMemento {

    private String text;

    public TextMemento(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
}
