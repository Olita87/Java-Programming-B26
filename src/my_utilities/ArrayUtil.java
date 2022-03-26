package my_utilities;

public class ArrayUtil {
    public static int minNumber(int [] nums){

        int min = nums[0];

        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    /*
    Max Number

    create a method that will accept an int array and return the biggest number from the array

     */

    public static int maxNumber(int [] nums){

        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }


}
