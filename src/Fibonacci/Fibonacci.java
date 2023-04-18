package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroLocalizado = 4;
        int num1 = 1, num2 = 0;
        boolean controle = false;

        System.out.print("digite a quantidade maxima a ser calculada: ");
        int maximo = sc.nextInt();


        for(int i = 0; i < maximo; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;

            if(numeroLocalizado == num1){
                controle = true;
                break;
            }
        }

        if(controle){
            System.out.println("numero pertence a sequencia");
        }else{
            System.out.println("numero não pertence a sequencia");
        }


    }
}
