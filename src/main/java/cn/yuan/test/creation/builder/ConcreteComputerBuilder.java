package cn.yuan.test.creation.builder;

public class ConcreteComputerBuilder implements ComputerBuild{
    private Computer computer;

    public ConcreteComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Intel i7");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16GB");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("1TB SSD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
