package cn.yuan.test.behavior.strategy;

public class QuickSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("sorting array using quick sort");
    }
}
