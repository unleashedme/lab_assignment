interface Person{
    static int A=20;
    void method1();
    static void method2(){
        System.out.println("in interface method 2");
    }
}
class Employee implements Person{
    public void method1(){
        System.out.println("in method 1");
    }
    public static void method2(){
        System.out.println("in method 2");
    }
}
public class lab8_program4 {
    public static void main(String args[]){
        Person p1 = new Employee();
        p1.method1();
        Person.method2();
        System.out.println(p1.A);
        Employee.method2();
    }
}
