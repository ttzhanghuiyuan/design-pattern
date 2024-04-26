package cn.yuan.test.behavior.visitor;

/**
 * 具体元素评论
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:54:53
 */
public class Comment implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void approve() {
        System.out.println("approving the comment.");
    }
}
