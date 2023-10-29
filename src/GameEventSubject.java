import java.util.ArrayList;
import java.util.List;

// Subject (Субъект) - Represents the subject of observation
class GameEventSubject {
    private List<Observer> observers = new ArrayList<>();

    // Register an observer to be notified when events occur
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Unregister an observer to stop receiving notifications
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all registered observers when an event occurs
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
