/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparadordepontos;

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;

public class ComparadorDePontos {
    public static void main(String[] args) {
        
        //Leitura de quantos pontos cada jogador tem
        String input1 = JOptionPane.showInputDialog("Digite a pontuação do Jogador 1:");
        String input2 = JOptionPane.showInputDialog("Digite a pontuação do Jogador 2:");
        String resultado = "";
        
        //Conversão para inteiros
        int pontos1 = Integer.parseInt(input1);
        int pontos2 = Integer.parseInt(input2);
        
        //Quem fez mais pontos?
        if (pontos1 > pontos2) {
            resultado += "Jogador 1 fez MAIS pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 NÃO fez mais pontos que o Jogador 2.\n";
        }

        //Quem fez menos pontos?
        if (pontos1 < pontos2) {
            resultado += "Jogador 1 fez MENOS pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 NÃO fez menos pontos que o Jogador 2.\n";
        }

        //Pontuações iguais?
        if (pontos1 == pontos2) {
            resultado += "Ambos os jogadores têm a MESMA pontuação.\n";
        } else {
            resultado += "As pontuações são DIFERENTES.\n";
        }

        //Diferente
        if (pontos1 != pontos2) {
            resultado += "Jogadores têm pontuações DIFERENTES.\n";
        } else {
            resultado += "Jogadores NÃO têm pontuações diferentes.\n";
        }

        //Maior ou igual
        if (pontos1 >= pontos2) {
            resultado += "Jogador 1 fez MAIS ou IGUAL pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 fez MENOS pontos que o Jogador 2.\n";
        }

        //Menor ou igual
        if (pontos1 <= pontos2) {
            resultado += "Jogador 1 fez MENOS ou IGUAL pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 fez MAIS pontos que o Jogador 2.\n";
        }
        //Mostra o resultado final
        JOptionPane.showMessageDialog(null, resultado);
    }
}
