package tddshapes;

public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public Rectangle(double side){
        this(side ,side );
    }

    @Override
    public boolean equals(Object comparedRectangle) {
        if (this == comparedRectangle) return true;
        if (comparedRectangle == null || getClass() != comparedRectangle.getClass()) return false;

        Rectangle rectangle = (Rectangle) comparedRectangle;

        if (Double.compare(rectangle.height, height) != 0) return false;
        if (Double.compare(rectangle.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = height != +0.0d ? Double.doubleToLongBits(height) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        temp = width != +0.0d ? Double.doubleToLongBits(width) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double calculateArea() {
        return height * width ;
    }
}
