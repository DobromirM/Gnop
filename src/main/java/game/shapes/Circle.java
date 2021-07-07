package game.shapes;

import game.coordinates.Coordinates;

public class Circle {

    public int radius;
    public Coordinates centerPoint;

    public Circle(int radius, Coordinates centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public int getRadius() {
        return radius;
    }

    public Coordinates getCenterPoint() {
        return centerPoint;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenterPoint(Coordinates centerPoint) {
        this.centerPoint = centerPoint;
    }
}
