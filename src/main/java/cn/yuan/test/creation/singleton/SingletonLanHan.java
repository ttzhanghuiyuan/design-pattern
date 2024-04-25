package cn.yuan.test.creation.singleton;

/**
 * 懒汉式单例
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-22 14:07:21
 * 单例模式懒汉式双重校验锁[推荐用]
 * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
 */
public class SingletonLanHan {

    private SingletonLanHan() {
    }

    private static SingletonLanHan singletonLanHan;

    public static SingletonLanHan getSingletonLanHan(){
        if (singletonLanHan == null){
            synchronized (SingletonLanHan.class){
                if (singletonLanHan == null){
                    singletonLanHan = new SingletonLanHan();
                }
            }
        }

        return singletonLanHan;
    }
}
