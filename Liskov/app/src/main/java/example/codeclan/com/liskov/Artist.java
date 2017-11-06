package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

class Artist {
  /*
    A liskov violation takes place when a function takes in a superclass as a parameter - it should be able to take in any of
    the superclass's subclasses without breaking.
    In this example, we can create a subclass of shape - say, triangle - that when passed to drawShape, returns null rather than
    "I'm drawing a triangle!".
    Change the code so that it will work regardless of the type of shape that is passed in.
    Hint - you can get the name of an object's class by doing something like:
    this.getClass().getSimpleName();
  */

    public String drawShape(Shape shape) {

        String shapeName = shape.getClass().getSimpleName();
        String lowCaseName = shapeName.toLowerCase();

            return "I'm drawing a " + lowCaseName + "!";

    }
}
