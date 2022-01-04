package lrf.designpattern.behavePattern.ObserverPattern;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:28
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
