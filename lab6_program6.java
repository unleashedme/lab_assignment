/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class WrapperClass{
    int i;
    WrapperClass(Integer j){
        i=j;
    }
    void display(){
        System.out.println(i);
    }
}
public class lab6_program6 {
    public static void main(String []args){
        WrapperClass w= new WrapperClass(10);
        w.display();
    }
}
