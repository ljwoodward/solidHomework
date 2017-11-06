package example.codeclan.com.interfacesegregation;

/**
 * Created by janemackay on 06/11/2017.
 */

public class PandaBear extends Bear {

    public Bamboo harvestBamboo(){
        return new Bamboo();
    }

}
