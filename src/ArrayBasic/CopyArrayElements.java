package ArrayBasic;

import java.util.Arrays;

public class CopyArrayElements {
    public static void main(String[] args) {
        int original[]= {3,5,7,9};
        int copy[]=new int[original.length];
        int index=0;
        for(int i=0;i<original.length;i++){
            copy[index]=original[i];
            index++;
        }

        System.out.println("My Original array :"+Arrays.toString(original));
        System.out.println("My Copied array :"+Arrays.toString(copy));
    }
}
