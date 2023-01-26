package ArrayBasic;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int original[]= {3,5,7,9};
        int copy[]=new int[original.length];
        int index=original.length-1;

        for(int i=0;i<original.length;i++){
            original[index]=original[i];
            index--;
        }

        System.out.println("Reverse Array:"+ Arrays.toString(copy));
    }
}
