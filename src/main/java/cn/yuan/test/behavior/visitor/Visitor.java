package cn.yuan.test.behavior.visitor;

/**
 * 抽象访问者接口
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:52:33
 */
public interface Visitor {

    void visit(Article article);

    void visit(Comment comment);
}
