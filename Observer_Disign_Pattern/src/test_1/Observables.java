package test_1;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:16 PM
 */

public interface Observables {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notification();
}
