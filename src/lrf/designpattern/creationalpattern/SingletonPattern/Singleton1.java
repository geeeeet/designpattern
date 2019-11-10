package lrf.designpattern.creationalpattern.SingletonPattern;

/**
 * 1、懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：否
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 *
 * @author lirufeng
 * @date 2019/1/25 16:32
 */
public class Singleton1 {
    private static Singleton1 instance;
    // 让构造函数为 private，这样该类就不会被实例化
    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void say () {
        System.out.println("I am SingleTon1");
    }
}
