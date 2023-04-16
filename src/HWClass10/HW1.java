package HWClass10;

public class HW1 {
    //Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
    // Then your program should print name of the students that has A and B grade

    public static void main(String[] args) {

        String[][] array={
                {"Alex","John","Mike","Nina"},
                {"A","B","C","D"}
        };

        for (int i = 0; i < array[0].length; i++) {
            if(array[1][i].equals("A") || array[1][i].equals("B")){
                System.out.println(array[0][i]+" "+array[1][i]);
            }

        }


    }
}
