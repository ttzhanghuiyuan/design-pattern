package cn.yuan.test.behavior.Iterator;

import java.util.List;

/**
 * 具体迭代器
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 16:24:08
 */
public class BookIterator implements Iterator{
    private List<String> books;
    private int position = 0;

    public BookIterator(List<String> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}
