package pl.sda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kg?");
        float weight = sc.nextFloat();
        System.out.println("Podaj swój wzrost w merach?");
        float height = sc.nextFloat();
        float bmi=bmi(weight, height);
        System.out.println(bmi);

    }
    private static float bmi(float weight, float height){
        return weight/(height*height);
    }
}
