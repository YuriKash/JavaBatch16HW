package HWClass10;

public class HW6 {
    //Create 2D array of countries:
    // north america countries, south america countries, europe countries, asian countries, african countries.
    // Then print all values from that array using 2 different loops and calculate how many total countries been stored.

    public static void main(String[] args) {
        String[][] array = {
                {"USA", "Canada"},
                {"Chile", "Brazil", "Ecuador"},
                {"Germany", "Italy", "Portuguese", "France"},
                {"China", "India", "Japan"},
                {"Sudan", "Egypt", "Morocco"},
        };

        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");

            }
            System.out.println();

        }
        System.out.println("----");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum=0;

        for (String[] strin : array) {
            sum+= strin.length;
        }
        System.out.println(sum);
    }
}
