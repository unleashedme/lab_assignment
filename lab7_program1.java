class shape{
    int area=10;
    int getArea(){
        return area;
    }
}
class rectangle extends shape{
    int length,width;
    rectangle(int l,int w){
        length=l;
        width=w;
    }
    int getArea(){
        return length*width;
    }
}
class box extends rectangle{
    int height;
    box(int l,int w,int h){
        super(l,w);
        length =l;
        width=w;
        height=h;
    }
    int getArea(){
        return 2*(length*width+width*height+height*length);
    }
}
public class lab7_program1 {
    public static void main(String args[]){
        shape s= new shape();
        System.out.println("area of shape is "+s.getArea());
        rectangle r= new rectangle(5,6);
        System.out.println("area of rectangle is "+r.getArea());
        box b= new box(1,2,3);
        System.out.println("area of box is "+b.getArea());
    }   
}
