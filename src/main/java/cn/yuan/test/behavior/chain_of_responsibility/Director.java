package cn.yuan.test.behavior.chain_of_responsibility;

public class Director implements Handler{
    @Override
    public void handleRequest(int days) {
        System.out.println("Director can approve leave for " + days + " days");
    }

    @Override
    public void setNextHandler(Handler handler) {

    }
}
