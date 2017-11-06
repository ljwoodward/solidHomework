package example.codeclan.com.interfacesegregation;

/**
 * Created by user on 27/06/2017.
 */

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

    GrizzlyBear grizzlyBear;
    HoneyBear honeyBear;
    PolarBear polarBear;
    PandaBear pandaBear;

    Edible salmon;
    Edible bamboo;
    Edible honey;
    Edible seal;

    @Before
    public void setup(){
        grizzlyBear = new GrizzlyBear();
        honeyBear = new HoneyBear();
        salmon = new Salmon();
        bamboo = new Bamboo();
        honey = new Honey();
        seal = new Seal();
    }

    @Test
    public void canEatSalmon(){
        grizzlyBear.eat(salmon);
        assertEquals(1, grizzlyBear.foodCount());
    }

    @Test
    public void cantEatIfBellyFull(){
        for (int i = 0; i < 7; i++){
            pandaBear.eat(salmon);
        }
        assertEquals(5, pandaBear.foodCount());
    }

    @Test
    public void canFishSalmon(){
        Edible freshSalmon = grizzlyBear.riverFish();
        assertEquals(Salmon.class, freshSalmon.getClass());
    }

    @Test
    public void canHarvestHoney(){
        Edible freshHoney = honeyBear.harvestHoney();
        assertEquals(Honey.class, freshHoney.getClass());
    }

    @Test
    public void canHarvestBamboo(){
        Edible freshBamboo = pandaBear.harvestBamboo();
        assertEquals(Bamboo.class, freshBamboo.getClass());
    }

}