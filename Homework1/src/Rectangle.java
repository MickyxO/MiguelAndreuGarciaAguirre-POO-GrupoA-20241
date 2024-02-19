public class Rectangle {

    double width, height;
    public Rectangle(double wi, double he){
        this.width=wi;
        this.height=he;
    }

    public double area_calculus(){
        double area=width*height;
        return area;
    }

    public double perimeter_calculus(){
        double perimeter= 2*(width+height);
        return perimeter;
    }
}
