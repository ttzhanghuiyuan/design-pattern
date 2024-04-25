package cn.yuan.test.behavior.chain_of_responsibility;

/**
 * 处理者接口
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 16:03:46
 */
public interface Handler {

    void handleRequest(int days);

    void setNextHandler(Handler handler);
}
