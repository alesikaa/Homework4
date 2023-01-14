package Homework4;

public class Task5 {
    public static void main(String[] args) {
        // print odd numbers between 20 and 50 (two ways)

        for (int i = 21; i<50; i+=2) {
            if (i % 2!=2 )
                System.out.println(i);

        }
        System.out.println("*********");
        for (int i = 21; i < 50; i+=2) {
            System.out.println(i);
        }
    }
}
