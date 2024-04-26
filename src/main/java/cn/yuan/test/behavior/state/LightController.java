package cn.yuan.test.behavior.state;

public class LightController {

    private State onState;
    private State offState;
    private State state;

    public LightController(){
        onState = new OnState();
        offState = new OffState();
        state = offState;
    }

    public void setState(State state){
        this.state = state;
    }

    public void turnOn(){
        state.turnOn();
        setState(onState);
    }

    public void turnOff(){
        state.turnOff();
        setState(offState);
    }

    public void brighten(){
        state.brighten();
    }

    public void dim(){
        state.dim();
    }
}
