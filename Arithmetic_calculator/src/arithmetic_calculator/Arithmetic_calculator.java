/*
Write a program where two numbers are taken as input and basic arithmetic operations
such as addition, subtraction, multiplication, and division is performed. 
 */
package arithmetic_calculator;
import java.util.Scanner;
public class Arithmetic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        float no1 = sc.nextFloat();
        System.out.println("Input the second number: ");
        float no2 = sc.nextFloat();
        float add = no1+no2;
        float sub = no1-no2;
        float multi = no1*no2;
        float rem = no1%no2;
        float quo = no1/no2;
        
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + multi);
        System.out.println("Remainder = " + rem);
        System.out.println("Quotient = " + quo);
        
       
    }
    
}
