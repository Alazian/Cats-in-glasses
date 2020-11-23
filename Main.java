package com.company;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {


        // to call a method
        // <yourMethodName>();
        example();
        methodRobert(2.4,4.5);
        methodIngrid(10,3);
        methodIngrid(10,3);


    }
    public static void yourMethod(){
       /* Add your code here
        it might be whatever you need
        youre gonna create new method
        and then add it to the main method
        that will make program much more coherent
        */
    }

     public static void example(){
         System.out.println("Example method");
     }
     public static void methodRobert (double number1,double number2){
         // author Robert Szlufik 
         // method will add two numbers entered when method is called,
         // calcuate sum and divide by 2
         double sum = (number1+number2)/2;
         System.out.println("sum of "+number1+" + "+number2+" devided by numebr of factors = "+sum);
     }
     public static void methodIngrid(int a, int b){
         // author Ingrid Castro.
         // method will subtract two numbers.
      int result = a - b;
      System.out.println("The subtraction of the values is equal to "+result);
    }
    public static void methodIngrid(int a, int b){
         // author Ingrid Castro.
         // method will subtract two numbers.
      int result = a - b;
      System.out.println("The subtraction of the values is equal to "+result);
    }
}

