package lrf.designpattern.behavePattern.ObserverPattern;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:25
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
