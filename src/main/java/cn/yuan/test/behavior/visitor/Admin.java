package cn.yuan.test.behavior.visitor;

/**
 * 具体访问者：管理员
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:56:04
 */
public class Admin implements Visitor {
    @Override
    public void visit(Article article) {
        article.publish();
    }

    @Override
    public void visit(Comment comment) {
        comment.approve();
    }
}
