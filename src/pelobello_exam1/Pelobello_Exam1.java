/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelobello_exam1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pelobello_Exam1 {

   
    public static void main(String[] args) {
       
     
        menu();
        
        
        
    }
    public static void menu(){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("1. ACT 1 2. ACT 2 3. ACT 3 4. ACT 4 5. ACT 5 6. Close6");
        System.out.print("Input your choice: ");
        int input = scan.nextInt();
        
        switch (input) {
            case 1: 
                inArray();
                break;
            case 2: 
                Prutas();
                break;
                case 3: 
                    myArr();
                break;
                case 4: 
                break;
                case 5: 
                    Fibonacci();
                break;
                case 6: 
                  scan.close();
                break;
            default:
               menu();
        }
    }
    //number 1
    public static void inArray(){
        int [] array={1,-2,3,-4,5};
        System.out.println("Original array");
        for(int i: array){
            System.out.print(i+" ");
        }
         System.out.println("");
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
           
            if (array[i]<j+1){
                System.out.print(j+" ");
            }
            
        }
        menu();
        
    }
    //number 2
    public static void Prutas(){
        LinkedList <String> list = new LinkedList<>();
       
        list.add("banana");
        list.add("apple");
        list.add("lanzones");
        list.add("durian");
        list.add("rambotan");
        list.add("kiwi");
        list.add("mansanitas");
        System.out.println("Original String prutas");
        System.out.println(list);
        System.out.println("Sorted na prutas");
        Collections.sort(list);
        System.out.println(list);
        menu();
    }
    //number 3
    public static void myArr(){
        System.out.println("Original Array");
       int []array = {1,2,3,4,5,6,7,8,9,10,13};
       for(int i:array){
           System.out.print(i+" ");
    }
       
        System.out.print("\nThe number of elements of your array are: ");
        for (int i = 0; i < array.length; i++) {
            
                if (array[i]>i*3) {
                    System.out.print(array.length);
            }
            
        }
         System.out.println(" ");
        menu();
    }
      public static int fibo(int n){
        if ( n <= 1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
      //number 4
    public static void positiveEvenNumbers(){
        int []array = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        int positiveEvenint = 0;
        int niggativeint;
        for (int i = positiveEvenint; i < array.length; i++) {
            
                System.out.println(array.length);
            
        }
        
        
    }
      
      
      
      
    public static void printFibo(int n){
        System.out.println("Fibonacci ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i)+" ");
            
        }
        System.out.println(fibo(n));
    }
    //number 5
    public static void Fibonacci(){
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n=scan.nextInt();
      
      if (n<0){
          System.out.println("0 is not define!");
      }
      else {
          printFibo(n);
      }
      menu();
      
        
    }

        
    }
    
    
    
    

