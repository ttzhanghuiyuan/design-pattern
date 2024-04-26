package cn.yuan.test.behavior.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("sorting array using bubble sort");
    }
}
