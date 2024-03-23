/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class lab10_program8 {
    
    static void method1(){
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    public static void main(String args[]){
        try{
            method3();
        }
        catch(Exception e){
            System.out.println("arithmetic Exception occured");
            e.printStackTrace();
        }
        
    }
    
}
