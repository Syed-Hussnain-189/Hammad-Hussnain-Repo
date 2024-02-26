public class Circle {

    double radius;
    public double setradius(double radius){
        this.radius = radius;
        return radius;
    };
    public void calculateArea(){
        double area =  Math.PI*radius*radius;
        System.out.println(area);
    };
    public void calculatePerimeter(){
        double perimeter =2*Math.PI*radius;
        System.out.println(perimeter);
    };

}
