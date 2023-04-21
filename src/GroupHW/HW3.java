package GroupHW;

import javax.sound.midi.Soundbank;

public class HW3 {
    public static void main(String[] args) {

        int[][] num={
                {1,2,4,5},
                {50,7,70,90},
                {5,8,80,91,100},
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
