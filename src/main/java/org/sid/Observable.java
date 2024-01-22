package org.sid;

public interface Observable {
    public void subscribe(Observer o );//addObserver
    public void unsubscribe (Observer o);//removeObserver
    public void notifyObservers();
}
