package GroupHW;

public class HW4 {
    public static void main(String[] args) {

        int[][] num = {
                {1, 2, 4, 5},
                {50, 7, 70, 90},
                {5, 8, 80, 91, 100},
        };

        int evenSum = 0;
        int oddSum = 0;

        for (int[] ints : num) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    evenSum = evenSum + anInt;
                }else if(anInt%2!=0){
                    oddSum=oddSum+anInt;
                }
            }
        }
        System.out.println("even sum is " + evenSum);
        System.out.println("odd sum is " + oddSum);
    }
}
