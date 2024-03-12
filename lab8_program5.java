abstract class base1{
    abstract class base2{
        abstract void display();
    }
}
class derived1 extends base1{
    class derived2 extends base2{
        void display(){
            System.out.println("in display");
        }    
    }
}
public class lab8_program5 {
    public static void main(String args[]){
        derived1 ab = new derived1();
        derived1.derived2 abc = ab.new derived2();
        abc.display();
    }
}
