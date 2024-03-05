class Circle{
    double radius;
    void set_width(int r){
        radius = r;
    }
    double area(){
        return 3.14*radius*radius;
    }
    double circuference(){
        return 6.28*radius;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(int r,int h){
        radius=r;
        height=h;
    }
    double volume(){
        return this.area()*height;
    }
}
public class lab7_program2 {
    public static void main(String args[]){
        Cylinder c= new Cylinder(2,4);
        System.out.println("area of base of cylender is "+c.area());
        System.out.println("volume of cylinder is "+c.volume());
    }
    
}
