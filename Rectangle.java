public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    public double calculateArea(){
        return length*width;

    }
    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public int getSides(){
        return sides;
    }
    public void setSides(int sides){
        this.sides = sides;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}
