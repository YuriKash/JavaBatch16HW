package HWClass10;

public class HW4 {
    //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers

    public static void main(String[] args) {
        int[][] num={
            {1,2,4,5},
            {50,60,70,90},
            {5,78,80,90,100},

        };

        int sum=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum=num[i][j]+sum;
            }
        }System.out.println(sum);

        System.out.println("------");

        int sum1=0;

        for (int[] ints : num) {
            for (int anInt : ints) {
                sum1=sum1+anInt;

            }

        }
        System.out.println(sum1);
    }
    }

