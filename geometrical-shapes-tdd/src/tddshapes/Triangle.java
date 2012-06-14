package tddshapes;

public class Triangle {
    private final int height;
    private final int widht;

    public Triangle(int heigh, int widht) {
        this.height = heigh;
        this.widht = widht;
    }

    public double calculateArea() {
        return widht*height/2;


    }
}

