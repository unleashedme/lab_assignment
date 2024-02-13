/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class PrintNumber{
    Integer i = new Integer(10);
    int i1=i;
    char ab ='c';
    Character ab1 = ab;
    void display(){
        System.out.println("value of i: "+i);
        System.out.println("value of i1 :"+i1);
        System.out.println("value of ab:"+ab);
        System.out.println("value of ab1:"+ab1);
    }
}
public class lab6_program5 {
    public static void main(String []args){
        PrintNumber p= new PrintNumber();
        p.display();
    }
}
