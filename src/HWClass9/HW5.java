package HWClass9;

public class HW5 {
    public static void main(String[] args) {
        /*Create an array of animals and store 5 elements into it.
         Using 2 different loops print all elements from the array.
         */
        String[] a={"dog","cat","rat","mouse","snake"};
        for (String s : a) {
            System.out.print(s+" ");
        }

        System.out.println();

        int couter=0;

        while(couter<a.length){
            System.out.print(a[couter]+" ");
            couter++;
        }

    }
}
