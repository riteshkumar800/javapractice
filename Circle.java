public class Circle extends Shape {

    double radius;

    Circle(double radius){
        // return radius*radius;
        this.radius=radius;
    }


    @Override
    double area(){
        return Math.PI*radius*radius;
    }
    
}
