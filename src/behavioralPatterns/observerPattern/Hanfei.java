package behavioralPatterns.observerPattern;

import java.util.ArrayList;

/**
 * @Author：Jack
 * @Date： 2021/9/13 - 19:35
 * @Description： ovserverPattern
 * @Version： 1.0
 */
public class Hanfei implements Observable,IHan{
    private ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void eat() {
        System.out.println("is eating");
        this.notifyAll("he is eating");
    }

    @Override
    public void out() {
        System.out.println("is outing");
        this.notifyAll("he is outing");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAll(String context) {
        for (Observer observer : observers) {
            observer.update(context);
        }
    }
}
