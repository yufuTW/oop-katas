import org.junit.Test;
import tddshapes.Rectangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void testRectangleConstructorAndCalculateArea(){
        //Given
        int side = 3;
        Rectangle square = new Rectangle(side);
        double expectedArea = 9;

        //When
        double area = square.calculateArea();

        //Then
        assertThat(expectedArea, is(area));
    }
}
