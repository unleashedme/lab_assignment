interface inter{
    int A=20;
    void method1();
    static void method2(){
        System.out.println("in inteface method 2");
    }
}
class xyz implements inter{
    public void method1(){
        System.out.println("in method 1");
    }
}
public class lab8_program8 {
    public static void main(String args []){
        inter c1 = new xyz();
        c1.method1();
        inter.method2();
        System.out.println(inter.A);
    }
}
