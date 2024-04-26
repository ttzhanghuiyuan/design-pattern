package cn.yuan.test.behavior.strategy;

public class Test {

    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter();

        sorter.setStrategy(new BubbleSort());
        int[] array1 = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        sorter.sort(array1);

        sorter.setStrategy(new QuickSort());
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        sorter.sort(array2);
    }
}
