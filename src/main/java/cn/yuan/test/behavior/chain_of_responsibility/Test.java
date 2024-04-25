package cn.yuan.test.behavior.chain_of_responsibility;

public class Test {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Manager manager = new Manager();
        Director director = new Director();

        teamLeader.setNextHandler(manager);
        manager.setNextHandler(director);

        teamLeader.handleRequest(1);
        teamLeader.handleRequest(4);
        teamLeader.handleRequest(7);
    }
}
