package cn.yuan.test.behavior.memento;

import java.util.Stack;

/**
 * 管理者类
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-26 11:06:50
 */
public class History {

    private Stack<TextMemento> mementos = new Stack<>();

    public void push(TextMemento memento)
    {
        mementos.push(memento);
    }

    public TextMemento pop()
    {
        return mementos.pop();
    }
}
