package HWClass9;

public class HW7 {
    public static void main(String[] args) {
        /*From an array of integer elements find the largest number
         */
        int[] a={1,2,33,4,5};
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);


    }
}
