package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

class Circle extends Shape {

    String name;


    public void Circle(){
        this.name = "circle";
    }

    @Override
    public String getName() {
        return name;
    }



}
