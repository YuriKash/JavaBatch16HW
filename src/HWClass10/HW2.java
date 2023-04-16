package HWClass10;

public class HW2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String[][] array = {
                {"Ford", "Chevy"},
                {"BMW", "VW"},
                {"Kia", "Hyndai"},
                {"Ferrari", "Lambo"},
        };

        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();

        }
        System.out.println("--------------");



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }
        }



    }
}
