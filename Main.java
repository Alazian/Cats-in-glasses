package com.company;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {


        // to call a method
        // <yourMethodName>();
        example();
        methodRobert(2.4,4.5);
        methodIngrid(10,3);
        methodFelipe (47,63);
        methodSkylar (68,91);
        methodBinderiya (25,35);
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
}
 /**
   
     */
    public static void MethodFelipe[] args) {
     BufferedReader bf= new BufferedReader (new InputStreamReader (System.in));
       try{
            
        System.out.println(" Enter First number:");
        int number1 = Integer.parseInt (bf.readLine()); // method will ask to enter a number
        
        System.out.println(" Enter second number:");
        int number2 = Integer.parseInt (bf.readLine());
        
        int sum = number1 + number2 ; // method will calculate the two number and sum it. 
        
        System.out.println ("The sum of " + number1 + "and" + number2 + "is" + sum);}
   
        catch (Exception e) { 
                        System.out.println("error this is not a number");  // if not possible calculate system show error 
                }
    }
        
        
        */
        public static void MethodSkylar(String[] args) {
       
        Scanner Sc = new Scanner(System.in);
        
        int num1, num2;
        
        try{
        
        System.out.println("Enter a number");
        num1 = Sc.nextInt();
        
        System.out.println("Enter another number");
        num2 = Sc.nextInt();
                       
        int divide = num1 / num2;
        
        System.out.printf("The answer for the division is %d\n ", divide);
        }
        
        catch (Exception e){
            System.out.println("ERROR!! That was not a number");
        
        } public static void methodBinderiya( int num1, int num2){
         // author Binderiya Enkhbayar.
         // method will multiply two numbers.
         int product = num1 * num2;
         System.out.println("Output: "+product);
    }
     
            
   }

