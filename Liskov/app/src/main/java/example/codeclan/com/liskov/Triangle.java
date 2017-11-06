package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

public class Triangle extends Shape {

    String name;

    public void Triangle() {
        this.name = "triangle";
    }

    @Override
    public String getName() {
        return name;
    }

}
