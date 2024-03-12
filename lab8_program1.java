class outerclass{
    void method1(){
        System.out.println("in outer class method");
        class innerclass{
            void method2(){
                System.out.println("in inner class method");
            }
        }
        innerclass in = new innerclass();
        in.method2();
    }
    static class innerclass2{
            public static void method3(){
                System.out.println("in inner static class");
            }    
        }
}
public class lab8_program1 {
    public static void main(String args[]){
        outerclass abc= new outerclass();
        abc.method1();
        outerclass.innerclass2.method3();
    }
}
