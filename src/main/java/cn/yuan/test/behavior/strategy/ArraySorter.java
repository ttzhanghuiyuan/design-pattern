package cn.yuan.test.behavior.strategy;

public class ArraySorter {

    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int[] arr){
        strategy.sort(arr);
    }
}
