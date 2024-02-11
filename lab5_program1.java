class parent{
    void show_parent(){
        System.out.println("in parent class");
    }
}
class child extends parent{
    void show_child(){
        System.out.println("in child class");
    }
}
public class lab5_program1 {
    public static void main(String []args){
        child c=new child();
        c.show_parent();
        c.show_child();
    }
}
