import org.junit.Test;
import tddshapes.Rectangle;
import tddshapes.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void testCalculateRightAreaForATriangle() {
        //Given
        Triangle triangle = new Triangle(10, 5);
        double expectedArea = 25;

        //When
        double area = triangle.calculateArea();
//
        //Test
        assertThat(area, is(expectedArea));
    }

    @Test
    public void testFindTheSmallestRectangleForATriangle() {
        //Given
        double height = 4;
        double width = 5;
        Triangle triangle = new Triangle(height, width) ;
        Rectangle expectedRectangle = new Rectangle(height, width);

        //When
        Rectangle actualRectangle = triangle.findTheSmallestRectangle();

        //Then
        assertThat(true, is(actualRectangle.equals(expectedRectangle)));
    }

}
