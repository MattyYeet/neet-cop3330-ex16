package reee;

import java.util.Scanner;

public class example16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("What is your age? ");
        age = input.nextInt();
        
        if(age >= 16)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else
        {
            System.out.println("You are not old enough to drive.");
        }
    }
}
