import org.junit.Test;
import tddshapes.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExampleTriangleTest {
    @Test
    public void returnsTheAreaOfTheTriangle() {
            //Given
        Triangle triangle = new Triangle(10, 5);

        //When
        double area = triangle.calculateArea();
//
        //Test

        assertThat(area, is(25d));

    }
}
