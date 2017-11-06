package example.codeclan.com.interfacesegregation;

/**
 * Created by janemackay on 06/11/2017.
 */

public class HoneyBear extends Bear {

    public Honey harvestHoney(){
        return new Honey();
    }


}
