package test_1;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 5/23/2023
 * Time :4:19 PM
 */

public class Client implements Observer{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void notifyMe() {
        System.out.println("added" + name);
    }
}
