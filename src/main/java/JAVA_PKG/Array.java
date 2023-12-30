package JAVA_PKG;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //SC1: print minimum no. from the multidimensional array //outcome = -5
        int ab[][] = {{3,3,4},{1,2,5},{-1,0,-5}};

        //create variable
        int min = ab[0][0];

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(ab[i][j]<min)
                {
                    min = ab[i][j];
                }
            }
        }
        System.out.println("Min Value: "+min);




        //SC2: print maximum no. from the multidimensional array //Outcome=8

        int abc[][] = {{3,3,4},{1,2,0},{-1,8,5}};

        //create variable
        int max = abc[0][0];

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(abc[i][j]>max)
                {
                    max = abc[i][j];
                }
            }
        }
        System.out.println("Max Value: "+max);

        //SC3: print maximum no. of the minimum colon from the multidimensional array //outcome = 10
        //step1: find min value
        //step2: find the min value colon
        //step3: find the maximum value of the min colon

        int xy[][] = {{3,13,4},{1,2,10},{-1,0,-4}};

        int minxy = xy[0][0];
        int minColon=0;

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                if(xy[i][j]<minxy)
                {
                    minxy = xy[i][j];
                    minColon = j;
                }
            }
        }

        int maxxy =  xy[0][0];
        int k = 0;
        while (k<3)
        {
            if(xy[k][minColon]>maxxy)
            {
                maxxy = xy[k][minColon];
            }
            k++;
        }
        System.out.println("Max Value of min colon: "+maxxy);


        //SC4: print minimum no. from the list //outcome = -1

        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(7);
        a.add(8);
        a.add(-1);

        int mi = a.get(0);

        for (int i=0;i<a.size();i++)
        {
           if(a.get(i)<mi)
           {
                mi = a.get(i);
            }
        }
        System.out.println("List min value: "+mi);

    }
}
