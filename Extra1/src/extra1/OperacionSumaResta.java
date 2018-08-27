/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import java.util.Scanner;


public class OperacionSumaResta {
    public static void suma(){
        Scanner ent=new Scanner (System.in);
        int a;
        int b;
        
        System.out.println("Teclea un numero"); a=ent.nextInt();
        System.out.println("Teclea otro numero"); b=ent.nextInt();
        
        System.out.println(a+"+"+b+"="+(a+b));
        
    }
    public static void resta(){
        Scanner ent=new Scanner (System.in);
        int a;
        int b;
        
        System.out.println("Teclea un numero"); a=ent.nextInt();
        System.out.println("Teclea otro numero"); b=ent.nextInt();
        
        System.out.println(a+"-"+b+"="+(a-b));
    }
}
