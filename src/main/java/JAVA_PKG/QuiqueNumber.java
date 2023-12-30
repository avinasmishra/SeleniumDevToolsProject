package JAVA_PKG;

import java.util.ArrayList;

public class QuiqueNumber {
    public static void main(String[] args) {
        //Print unique number from the given array/list

        int a[] = {1, 1, 3, 3, 5, 3, 3, 4, 5};

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (!arrayList.contains(a[i])) {
                arrayList.add(a[i]);
                count++;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
                System.out.println(a[i]+ " count is "+count);
                if (count==1)
                {
                    System.out.println(a[i]+" is unique number.");
                }
            }
        }
    }
}
