package lrf.designpattern.behavePattern.ObserverPattern;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:29
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
