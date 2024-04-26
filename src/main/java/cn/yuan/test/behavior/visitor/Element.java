package cn.yuan.test.behavior.visitor;

/**
 * 抽象接口元素
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-26 15:51:13
 */
public interface Element {
    void accept(Visitor visitor);
}
