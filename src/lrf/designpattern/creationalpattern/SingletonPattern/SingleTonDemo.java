package lrf.designpattern.creationalpattern.SingletonPattern;

/**
 * 单例模式测试
 *
 * @author lirufeng
 * @date 2019/1/25 16:34
 */
public class SingleTonDemo {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        s1.say();

        Singleton2 s2 = Singleton2.getInstance();
        s2.say();

        Singleton3 s3 = Singleton3.getInstance();
        s3.say();

        Singleton4 s4 = Singleton4.getInstance();
        s4.say();

        Singleton5 s5 = Singleton5.getInstance();
        s5.say();

        Singleton6 s6 = Singleton6.INSTANCE;
        s6.say();
    }
}