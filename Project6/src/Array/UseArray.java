package Array;

import java.util.Scanner;
import java.util.Random;

public class UseArray
{

    public static void main(String[] args)
    {
        int limit = 5;
        int [] array = new int[limit];

        //input value from scanner
        //  Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please Enter some integer number: ");
        for (int i=0;i<array.length;i++)
        {
            //Generate random number and insert to array
            array[i]=random.nextInt(10);
//            array[i]=sc.nextInt();
        }

        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}


