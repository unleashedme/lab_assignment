class Rectangle{
    int length,breadth;
    Rectangle(){
        length=1;
        breadth=1;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        super();
        length=1;
        breadth=1;
        height=1;
    }
    Cuboid(int l,int b,int h){
        super(l,b);
        length=l;
        breadth=b;
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
class cube extends Cuboid{
    cube(int a){
        length=a;
        breadth=a;
        height=a;
    }
    int volume(){
        return length*breadth*height;
    }
}
public class lab7_program3 {
    public static void main(String args[]){
        Cuboid c1= new Cuboid();
        System.out.println("volume of cuboid is "+c1.volume());
        Cuboid c2= new Cuboid(3,4,5);
        System.out.println("volume of cuboid is "+c2.volume());
    }
    
}
