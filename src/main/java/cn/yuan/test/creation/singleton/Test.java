package cn.yuan.test.creation.singleton;


/**
 * 测试单例
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-22 14:21:20
 */
public class Test {

    public static void main(String[] args) {
        //饿汉式[可用]
        SingletonEHan singletonEHan = SingletonEHan.getInstance();
        //懒汉式[双重校验锁 推荐用]
        SingletonLanHan singletonLanHan = SingletonLanHan.getSingletonLanHan();
        //内部类[推荐用]
        SingletonIn singletonIn = SingletonIn.getSingletonIn();
        //枚举[推荐用]
        SingletonEnum.instance.method();
    }
}
