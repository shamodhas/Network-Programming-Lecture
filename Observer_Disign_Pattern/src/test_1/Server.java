package test_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:19 PM
 */

public class Server implements Observables{
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer: observers){
            observer.notifyMe();
        }
    }
}
