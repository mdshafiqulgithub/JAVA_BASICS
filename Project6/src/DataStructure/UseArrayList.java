package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Array list is a class on top of the array
public class UseArrayList {

    public static void main(String[] args)
    {
        int limit=10;
        List<Integer> numberList = new ArrayList<Integer>();
        Random random = new Random();

        for(int i=0;i<limit;i++)
        {
            //Arraylist addMethod
            numberList.add(random.nextInt(100));
        }
        for (int j=0;j<numberList.size();j++)
        {
            System.out.println(numberList.get(j));
        }


    }

}
