/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.fastfood;

/**
 *
 * @author kethe
 */
public class ComboFacade {
    private Combo combo;
 
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1 -> combo = new Combo(new Burger("Calafrangao", 35.0),
                                  new Bebida("Coca-Cola Zero", 8.0),
                                  new Sobremesa("Gelatto", 20.0));
            case 2 -> combo = new Combo(new Burger("X-EGG", 20.0),
                                  new Bebida("Suco de Acerola", 15.0),
                                  new Sobremesa("Torta de Cookie", 22.0));
            case 3 -> combo = new Combo(new Burger("X-Bacon", 25.0),
                                  new Bebida("Suco de Laranja", 12.0),
                                  new Sobremesa("Pudim", 18.0));
            case 4 -> combo = new Combo(new Burger("X-Salada", 15.0),
                                  new Bebida("Refrigerante", 8.0),
                                  new Sobremesa("Pavê", 15.0));
            case 5 -> combo = new Combo(new Burger("X-Frango", 22.0),
                                  new Bebida("Pepsi Black", 8.0),
                                  new Sobremesa("Torta de Limão", 20.0));
            case 6 -> combo = new Combo(new Burger("X-Tudo", 40.0),
                                  new Bebida("Cerveja", 12.0),
                                  new Sobremesa("Gran Gateau", 30.0));
            default -> System.out.println("Código de combo inválido!");
        }
    }
 
    public void exibirItens() {
        if (combo != null) {
            System.out.println("Itens do Combo:");
            System.out.println(combo.getBurger());
            System.out.println(combo.getBebida());
            System.out.println(combo.getSobremesa());
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }
 
    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco()
                 + combo.getBebida().getPreco()
                 + combo.getSobremesa().getPreco();
        }
        return 0;
    }
}