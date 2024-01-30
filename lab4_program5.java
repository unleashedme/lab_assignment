class area{
    int a=0;
    int b=0;
    area(int... a){
        if(a.length==0){
            System.out.println("area:"+0);
        }
        if(a.length==2){
            areaofRectangle(a[0],a[1]);
        }
        if(a.length==1){
            areaofSquare(a[0]);
        }
    }
    void areaofRectangle(int a,int b){
        System.out.println("area of rectangle is:"+a*b);
    }
    void areaofSquare(int a){
        System.out.println("area of square is:"+a*a);
    }
}
public class lab4_program5 {
    public static void main(String [] aergs){
        area rec =new area(3,4);
        area sq=new area(6);
        area ar=new area();
    }
    
}
