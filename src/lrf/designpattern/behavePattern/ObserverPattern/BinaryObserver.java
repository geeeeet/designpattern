package lrf.designpattern.behavePattern.ObserverPattern;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:26
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
