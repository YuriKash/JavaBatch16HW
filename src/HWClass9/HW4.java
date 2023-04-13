package HWClass9;

public class HW4 {
    public static void main(String[] args) {
        /*Create an array of cars and store 6 elements into it.
        Using 2 different loops print all values from the array.
         */

        String[] cars={"BMW","Mercedes","Lexus","Toyota","Honda","VW"};

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println();

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");

        }


    }
}
