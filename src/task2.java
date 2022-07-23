import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        System.out.println("Введите имя");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        if (name.equals("Вячеслав")){
            System.out.println("Привет, " + name);
        } else{
            System.out.println("Нет такого имени");
        }
    }
}
