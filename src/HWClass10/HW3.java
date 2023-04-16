package HWClass10;

public class HW3 {
    public static void main(String[] args) {


        //Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String[][] array = {
                {"Veggies", "fruits", "dairy", "sweets"}, // should have done differnet lists
                {"Cucumbers", "Apples", "Milk", "Candy"},
                {"Potatos", "Pears", "Yogurt", "cakes"},
                {"Onions", "Oranges"},
        };

        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();

        }

    }

}
