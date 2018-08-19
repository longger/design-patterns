package observer;

public interface Subject {

    // 订阅
    public void registerObserver(Observer observer);
   // 取消订阅
    public void removeObserver(Observer observer);
    
    // 当主题状态改变时，这个方法会被调用，以通知所有的观察者
    public void notifyObservers();
}
