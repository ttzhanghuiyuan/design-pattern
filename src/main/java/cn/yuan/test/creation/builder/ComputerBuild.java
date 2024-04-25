package cn.yuan.test.creation.builder;

public interface ComputerBuild {

    void buildCPU();

    void buildMemory();

    void buildHardDisk();

    Computer getComputer();
}
