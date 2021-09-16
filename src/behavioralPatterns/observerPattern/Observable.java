package behavioralPatterns.observerPattern;

/**
 * @Author：Jack
 * @Date： 2021/9/13 - 19:33
 * @Description： ovserverPattern
 * @Version： 1.0
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyAll(String context);

}
