package ExceptionsHomeWork2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        float numb = inputUser2();
        System.out.println(numb);
    }

    public static float inputUser(){
        boolean temp = true;
        float num = 0;
        while (temp) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число: ");
                num = in.nextFloat();
                temp = false;
                in.close();
            } catch (RuntimeException e) {
                System.out.println("Неверный ввод. Повторите попытку");
                System.out.println();
            }
        }
        return num;
    }

    public static float inputUser2() {
        float number = 0;
        boolean temp = true;
        while (temp){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            if (sc.hasNextFloat()) {
                number = sc.nextFloat();
                temp = false;
            } else {
                System.out.println("Неверный ввод. Повторите попытку");
                System.out.println();
            }
        }
        return number;
    }
}
