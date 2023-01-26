package ArrayBasic;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] nums = {2, 2,12,12, 15,11,2, 11, 7, 19, 45};
        int target = 7;
        findDuplicate(nums);
       System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public static void findDuplicate(int[] nums){
        int count=0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){

                if(nums[i]==nums[j]){
                    count++;
                }
            }
            System.out.println(nums[i]+":"+count);
            count=0;
        }
    }

}
