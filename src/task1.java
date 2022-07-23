import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i > 7){
            System.out.println("Привет");
        }
    }
}