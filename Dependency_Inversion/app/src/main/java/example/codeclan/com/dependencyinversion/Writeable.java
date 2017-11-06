package example.codeclan.com.dependencyinversion;

/**
 * Created by janemackay on 06/11/2017.
 */

public interface Writeable {

    public void write(String text);

    public String readLast();
}
