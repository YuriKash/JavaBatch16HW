package HWClass9;

public class HW1 {
    public static void main(String[] args) {
        /* Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).*/

        char[] grades={'a','b','c','d'};

        char[] grades1=new char[4];
        grades1[0]='a';
        grades1[1]='b';
        grades1[2]='c';
        grades1[3]='d';

        System.out.println(grades1[1]);
        System.out.println(grades[1]);


    }
}
