package tddshapes;

public class Triangle {
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return width *height/2;
    }

    public Rectangle findTheSmallestRectangle() {
        return new Rectangle(height, width);
    }
}

