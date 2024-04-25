package cn.yuan.test.creation.builder;

public class Test {

    public static void main(String[] args) {
        ComputerBuild computerBuild = new ConcreteComputerBuilder();
        Director director = new Director(computerBuild);

        Computer computer = director.construct();
        System.out.println(computer);
    }
}
