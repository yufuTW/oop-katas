import org.junit.Test;
import shapes.Circle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {

    @Test
    public void returnsTheAreaOfTheCircle() {

        //Given
        Circle circle = new Circle(5);
        double expectedArea = Math.PI * 25;

        //When
        double actualArea = circle.calculateArea();

        //Then
        assertThat(actualArea, is(expectedArea));
    }
}
