class bird{
    void fly(){
        System.out.println("bird is flying");
    }
}
class parrot extends bird{
    void show_colour(){
        System.out.println("colour of parrot is green");
    }
}
class crow extends bird{
    void show_colour(){
        System.out.println("colour of crow is black");
    }
}

public class lab5_program2 {
    public static void main(String []args){
        crow c= new crow();
        c.fly();
        c.show_colour();
        parrot p= new parrot();
        p.fly();
        p.show_colour();
    }
}
