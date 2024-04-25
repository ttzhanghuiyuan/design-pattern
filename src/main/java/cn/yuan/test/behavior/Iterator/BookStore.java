package cn.yuan.test.behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 16:27:24
 */
public class BookStore implements Aggregate{
    private List<String> books = new ArrayList<>();

    public void addBook(String book){
        books.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
