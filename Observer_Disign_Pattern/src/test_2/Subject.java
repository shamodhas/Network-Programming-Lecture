package test_2;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/25/2023
 * Time :4:15 PM
 */

public interface Subject {
    //methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer obj);
}
