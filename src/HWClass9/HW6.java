package HWClass9;

public class HW6 {
    public static void main(String[] args) {
        /*Create an array on integers
        and calculate the sum of all elements in an array
         */

        int[] a={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=a[i]+sum;
        }
        System.out.println(sum);


    }
}
