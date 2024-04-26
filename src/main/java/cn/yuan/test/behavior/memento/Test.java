package cn.yuan.test.behavior.memento;

public class Test {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("First text");
        history.push(editor.save());

        editor.setText("Second text");
        history.push(editor.save());

        editor.setText("Third text");
        editor.restore(history.pop());
        editor.restore(history.pop());
    }
}
