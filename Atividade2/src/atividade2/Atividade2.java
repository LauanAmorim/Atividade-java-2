package atividade2;

import java.util.Scanner;




public class Atividade2 {
    
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);
        double num = 0;
        double result = 0;
        for(int i = 0; num >= 0; i++){
            System.out.print("Insira o valor: ");
                num = scInput.nextDouble();
                if (num >= 0){
                result += num;
                }
                if (num < 0) {
                    System.out.print(result/i);
                }
        }
    }
    
}
