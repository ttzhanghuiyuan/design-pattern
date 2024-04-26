package cn.yuan.test.behavior.memento;

/**
 * 发起人类
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-26 11:04:24
 */
public class TextEditor {
    private String text;

    public void setText(String text){
        System.out.println("Setting text to: " + text);
        this.text = text;
    }

    public TextMemento save(){
        System.out.println("Saving state ...");
        return new TextMemento(text);
    }

    public void restore(TextMemento memento){
        System.out.println("Restoring state ...");
        this.text = memento.getText();
    }
}
