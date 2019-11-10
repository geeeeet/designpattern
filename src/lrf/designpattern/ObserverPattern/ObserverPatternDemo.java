package lrf.designpattern.ObserverPattern;

import java.util.Map;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:29
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(150);
        System.out.println("Second state change: 10");
        subject.setState(10);



        Integer i0 = 122,i1=122,i2=127,i3=127,i4=1266,i5=1266;
        System.out.println(i0==i1);
        System.out.println(i2==i3);
        System.out.println(i4.byteValue()==i5.byteValue());

//        Map<String>
    }
}
