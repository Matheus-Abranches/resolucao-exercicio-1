import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        numeros number = new numeros();


        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor de A");
        a = scanner.nextInt();

        System.out.println("digite o valor de B");
        b = scanner.nextInt();

        System.out.println("digite o valor de C");
        c = scanner.nextInt();

        int somaAb = number.sum(a, b);
        System.out.println("a soma de A e B é igual a: " + somaAb);

         if (somaAb < c){
             System.out.println("logo a soma de A e B é menor que C");
         } if (somaAb > c){
            System.out.println("logo a soma de A e B é maior que C");
        }
        }


    }
