package cn.yuan.test.behavior.visitor;

/**
 * 具体元素文章
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:55:17
 */
public class Article implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void publish() {
        System.out.println("publishing the article");
    }
}
