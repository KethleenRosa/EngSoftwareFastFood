/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.fastfood;
 
import java.util.Scanner;

/**
 *
 * @author kethe
 */
public class FastFoodKeth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 - Combo Calafrango");
        System.out.println("2 - Combo Egg");
        System.out.println("3 - Combo Bacon");
        System.out.println("4 - Combo Salada");
        System.out.println("5 - Combo Frango");
        System.out.println("6 - Combo Tudão");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();
 
        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());
    }
    
}
