package HWClass10;

public class HW5 {
    //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
    // Develop a program which will identify/print the even numbers only.

    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 4, 5},
                {50, 60, 71, 90},
                {5, 78, 83, 90},
        };

        for (int[] ints : num) {
            for (int anInt : ints) {
                if(anInt%2==0){
                    System.out.print(anInt+" ");
                }

            }

        }
    }
}
