package cn.yuan.test.behavior.Iterator;

public class Test {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.addBook("Java");
        bookStore.addBook("C++");
        bookStore.addBook("Python");

        Iterator iterator = bookStore.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
