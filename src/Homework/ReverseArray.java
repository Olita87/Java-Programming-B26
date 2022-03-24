package Homework;

public class ReverseArray {


        public static void main(String[] args) {


            int[] arr = {1, 2, 3, 4, 5, 6};//[6, 5, 4, 3, 2, 1]
            int[] revers = new int[arr.length];//an empty array to add the numbers to [0, 0, 0, 0, 0, 0]

            for (int i = 0 , j = arr.length - 1;  i < arr.length; i++ , j--) {//i = 0 , j = 5 -> i = 1 , j = 4
                revers[i] = arr[j];//taking the last number in arr array with index j and adding it to revers array at the position of i
            }

            System.out.println(Arrays.toString(revers));

        }
    }

