/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Iurii
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your string, please");             
        if(sc.hasNext()){   
            String a = sc.next();//Scan string
            new Palindrome().IsPalindrome(a);
        }   
       
    }
    /*Testing string for polindrome*/
    public boolean IsPalindrome(String a){
        //Make reverse and comparing:    
        if(a.compareToIgnoreCase(new StringBuffer(a).reverse().toString()) == 0){
            System.out.println("It's palindrome :)"); 
            return true;
        }else {
            System.out.println("No palindrome :(");
            return true;
        }
    }
       
    
}
