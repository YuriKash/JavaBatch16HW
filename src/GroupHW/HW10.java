package GroupHW;

public class HW10 {
    public static void main(String[] args) {

        String[] names = {"Yuri", "Uros", "Yuri", "Sarah", "Zak", "Suzanne", "Sarah"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[j] + " ");

                }

            }

        }
    }
}
