class Base{
    void Display(){
        System.out.println("in base class");
    }
    void show(){
        System.out.println("in base show");
    }
}
class Derived extends Base{
    void show(){
        System.out.println("in derived show");
    }
}
public class lab7_program5 {
    public static void main(String args[]){
        Base b1 = new Base();
        b1.Display();
        //b1.show();
        Base b2 = new Derived();
        b2.Display();
        b2.show();
    }
}
