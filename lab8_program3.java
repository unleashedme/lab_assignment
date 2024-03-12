abstract class shape{
    abstract double area();
    abstract double perimeter();
}
class circle extends shape{
    int radius;
    circle(int r){
        radius=r;
    }
    double area(){
        return 3.14*radius*radius;
    }
    double perimeter(){
        return 6.28*radius;
    }
}
class rectangle extends shape{
    int length,breadth;
    rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }    
}
public class lab8_program3 {
    public static void main(String args[]){
        shape c1= new circle(5);
        System.out.println("area of cicle is: "+c1.area());
        System.out.println("primeter of cicle is: "+c1.perimeter());
        rectangle r1 = new rectangle(2,3);
        System.out.println("area of rectangle is: "+r1.area());
        System.out.println("area of rectangle is: "+r1.perimeter());
    }
}
