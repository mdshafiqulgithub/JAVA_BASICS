package LogicalConditional;

import java.util.Scanner;
public class LogicalStatement {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Type the Number :");

        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Num is "+ "Even");
        }
        else
        {
            System.out.println("Num is "+ "Odd");
        }
    }
}