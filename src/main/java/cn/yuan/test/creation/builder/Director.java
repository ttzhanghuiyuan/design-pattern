package cn.yuan.test.creation.builder;

public class Director {

    private ComputerBuild computerBuild;

    public Director(ComputerBuild computerBuild)
    {
        this.computerBuild = computerBuild;
    }

    public Computer construct()
    {
        computerBuild.buildCPU();
        computerBuild.buildMemory();
        computerBuild.buildHardDisk();
        return computerBuild.getComputer();
    }
}
