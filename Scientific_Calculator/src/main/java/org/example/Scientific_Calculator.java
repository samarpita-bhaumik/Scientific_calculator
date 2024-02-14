package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Scientific_Calculator {
    public double factorial(int x)
    {
        double fact=1;
        for(int i=1;i<=x;i++)
          fact=fact*i;
        return fact;
    }
    public double naturalLogFun(int x){
        return Math.log(x);
    }

    public long powerFunc(int x, int b) {
        return (long) Math.pow(x, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scientific_Calculator sci= new Scientific_Calculator();

        while(true){
            System.out.println("Choose operation \n" +"1. Square root function - √x \n"+"2. Factorial function - x!\n"+"3. Natural logarithm (base е) - ln(x)\n"+"4. Power function - x^b\n"+"5. Press 7 to exit\n");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            int x;
            int b;
            double result;
            switch(ch)
            {
                case 1:
                    System.out.println("Enter a number:");
                    x=sc.nextInt();
                    result=Math.sqrt(x);
                    System.out.println("Square root function of x is :" + result);
                    break;
                case 2:
                    System.out.println("Enter a number:");
                    x=sc.nextInt();
                    result=sci.factorial(x);
                    System.out.println("Factorial of x is :" + result);
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    x=sc.nextInt();
                    result=sci.naturalLogFun(x);
                    System.out.println("Natural logarithm (base е) is :" + result);
                    break;
                case 4:
                    System.out.println("Enter a number:");
                    x=sc.nextInt();
                    System.out.println("Enter another number:");
                    b=sc.nextInt();
                    long result1=sci.powerFunc(x,b);
                    System.out.println("Power function :" + result1);
                    break;
                default:
                    System.out.println("Exiting \n");
                    exit(0);
            }
        }

    }
}
