package cn.yuan.test.behavior.chain_of_responsibility;

public class Manager implements Handler {

    private Handler nextHandler;


    @Override
    public void handleRequest(int days) {
        if (days <= 5) {
            System.out.println("Manager approves the leave for " + days + " days");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(days);
        } else {
            System.out.println("No one can approve the leave for " + days + " days");
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
