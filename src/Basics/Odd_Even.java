package Basics;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Plse enter the number");
        int n=sc.nextInt();
        if (n%2==0){
            System.out.printf("Odd number");
        }
        else{
            System.out.printf("Even number");
        }
    }
}
