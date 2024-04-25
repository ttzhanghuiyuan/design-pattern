package cn.yuan.test.creation.singleton;

/**
 * 单例内部类方式
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-22 14:09:49
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
public class SingletonIn {

    private SingletonIn() {

    }

    private static class SingletonInner {
        private static SingletonIn singletonIn = new SingletonIn();
    }

    public static SingletonIn getSingletonIn() {
        return SingletonInner.singletonIn;
    }
}
