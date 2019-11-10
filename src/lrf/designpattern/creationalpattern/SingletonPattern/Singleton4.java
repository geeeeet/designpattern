package lrf.designpattern.creationalpattern.SingletonPattern;

/**
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 是否 Lazy 初始化：是
 是否多线程安全：是
 实现难度：较复杂
 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 getInstance() 的性能对应用程序很关键。
 *
 * @author lirufeng
 * @date 2019/2/14 16:01
 */
public class Singleton4 {

    private volatile static Singleton4 singleton4;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

    public void say () {
        System.out.println("I am SingleTon4");
    }

}
