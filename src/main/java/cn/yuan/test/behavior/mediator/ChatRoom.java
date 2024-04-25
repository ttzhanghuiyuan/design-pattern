package cn.yuan.test.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator{
    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague)
    {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague c : colleagues){
            if (c != colleague){
                c.receiveMessage(message);
            }
        }
    }
}
