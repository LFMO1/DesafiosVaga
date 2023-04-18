package ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String invertida = "";
        StringBuilder invertidaBuilder = new StringBuilder();

        System.out.println("Digite a String a ser invertida: ");
        String str = sc.next();

        for (int i = str.length()-1; i >=0; i--){
            invertidaBuilder.append(str.charAt(i));
        }

        invertida = invertidaBuilder.toString();
        System.out.println(invertida);
    }
}
