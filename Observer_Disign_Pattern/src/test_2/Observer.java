package test_2;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/25/2023
 * Time :4:17 PM
 */

public interface Observer {
    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
