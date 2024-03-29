package lrf.designpattern.behavePattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lirufeng
 * @Date 2019/5/20 17:24
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
