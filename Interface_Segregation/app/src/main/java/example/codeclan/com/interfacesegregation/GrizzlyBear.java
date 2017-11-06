package example.codeclan.com.interfacesegregation;


/**
 * Created by janemackay on 06/11/2017.
 */

public class GrizzlyBear extends Bear {

    public Salmon riverFish(){
        return new Salmon();
    }


}
