/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1038 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codigo, itens;
        double n1, n2, n3, n4, n5;

        //System.out.println("Digite o codigo do produto: ");
        codigo = leitor.nextInt();
        //System.out.println("Digite a quantidade de itens: ");
        itens = leitor.nextInt();

        if (codigo == 1) {
            n1 = itens * 4.0;
            System.out.printf("Total: R$ %.2f%n", n1);
        } else {
            if (codigo == 2) {
                n2 = itens * 4.50;
                System.out.printf("Total: R$ %.2f%n", n2);
            } else {
                if (codigo == 3) {
                    n3 = itens * 5.00;
                    System.out.printf("Total: R$ %.2f%n", n3);
                } else {
                    if (codigo == 4) {
                        n4 = itens * 2.00;
                        System.out.printf("Total: R$ %.2f%n", n4);
                    } else {
                        if (codigo == 5) {
                            n5 = itens * 1.50;
                            System.out.printf("Total: R$ %.2f%n", n5);
                        }
                    }
                }
            }
        }
    }
}

