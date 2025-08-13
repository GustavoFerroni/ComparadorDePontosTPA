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
        //Pede pro usuario os números e faz o estudo dos números digitados
        String input1 = JOptionPane.showInputDialog("Digite a pontuação do Jogador 1:");
        String input2 = JOptionPane.showInputDialog("Digite a pontuação do Jogador 2:");
        String resultado = "";
        
        //Conversão para inteiros
        //converte os números para variaveis
        int pontos1 = Integer.parseInt(input1);
        int pontos2 = Integer.parseInt(input2);
        
        //Quem fez mais pontos?
        //Compara qual das duas pontuações é a maior
        if (pontos1 > pontos2) {
            resultado += "Jogador 1 fez MAIS pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 NÃO fez mais pontos que o Jogador 2.\n";
        }

        //Quem fez menos pontos?
        //Compara qual das duas pontuações é a menor
        if (pontos1 < pontos2) {
            resultado += "Jogador 1 fez MENOS pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 NÃO fez menos pontos que o Jogador 2.\n";
        }

        //Pontuações iguais
        //Aponta se as pontuações são iguais ou não
        if (pontos1 == pontos2) {
            resultado += "Ambos os jogadores têm a MESMA pontuação.\n";
        } else {
            resultado += "As pontuações são DIFERENTES.\n";
        }

        //Diferentes
        //Aponta se as pontuações são diferentes ou não
        if (pontos1 != pontos2) {
            resultado += "Jogadores têm pontuações DIFERENTES.\n";
        } else {
            resultado += "Jogadores NÃO têm pontuações diferentes.\n";
        }

        //Maior ou igual
        //Aponta qual a pontuação maior ou igual
        if (pontos1 >= pontos2) {
            resultado += "Jogador 1 fez MAIS ou IGUAL pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 fez MENOS pontos que o Jogador 2.\n";
        }

        //Menor ou igual
        //Aponta qual a pontuação é menor ou igual
        if (pontos1 <= pontos2) {
            resultado += "Jogador 1 fez MENOS ou IGUAL pontos que o Jogador 2.\n";
        } else {
            resultado += "Jogador 1 fez MAIS pontos que o Jogador 2.\n";
        }
        //Mostra o resultado final
        //Exibe o resultados de todas as comparações na tela 
        JOptionPane.showMessageDialog(null, resultado);
    }
}
