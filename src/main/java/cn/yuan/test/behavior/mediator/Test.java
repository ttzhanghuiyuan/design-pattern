package cn.yuan.test.behavior.mediator;

public class Test {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User user1 = new User("张三", chatRoom);
        User user2 = new User("李四", chatRoom);
        User user3 = new User("王五", chatRoom);

        chatRoom.addColleague(user1);
        chatRoom.addColleague(user2);
        chatRoom.addColleague(user3);

        user1.sendMessage("大家好，我是张三");
        user2.sendMessage("大家好，我是李四");
        user3.sendMessage("大家好，我是王五");
    }
}
