package cn.yuan.test.behavior.chain_of_responsibility;

public class TeamLeader implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(int days) {
        if (days <= 2) {
            System.out.println("Team Leader approves the leave for " + days + " days.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(days);
        } else {
            System.out.println("No one can approves the leave for " + days + " days.");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
