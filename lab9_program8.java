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
public class lab9_program8 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        String str3=s.next();
        String str4=s.next();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str4));
    }
}
