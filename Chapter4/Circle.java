public class Circle {
    public double radius, diameter, area;

    Circle(int a, int b){
        this.radius = 1.00;
        diameter = a;
        area = b;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double x){
        this.radius = x;
        this.diameter = ( x * 2 );
        this.area = (Math.PI * x * x);
    }
}
