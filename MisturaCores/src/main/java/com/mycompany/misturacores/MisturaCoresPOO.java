/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misturacores;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuário do Windows
 */
public class MisturaCoresPOO {

    public MisturaCoresPOO() {
        
        int opcao=-1;
        
        while(opcao!=0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("-MISTURA DE CORES-\nEscolha uma opção:\n\n1 - Misturar duas cores\n2 - Descobrir uma combinação\n0 - Sair"));
            
            switch(opcao){
                case 1:
                    String cor1 = JOptionPane.showInputDialog("Digite a primeira cor para combinação:");
                    String cor2 = JOptionPane.showInputDialog("Digite a segunda cor para combinação:");
                    String resultado;
                    break;
                    
                case 2:
                    String cor = JOptionPane.showInputDialog("Digite a cor que deseja fazer:");
                    break;
            }
        }
    }
    
    public static class CombinacaoCor{
        String cor1, cor2, corResultante;

        public CombinacaoCor(String cor1, String cor2, String corResultante) {
            this.cor1 = cor1;
            this.cor2 = cor2;
            this.corResultante = corResultante;
        }

        public String getCor1() {
            return cor1;
        }

        public String getCor2() {
            return cor2;
        }
        
        public String getCorResultante() {
            return corResultante;
        }
    }
    
    public static class BancoDeCores{
        
        public static ArrayList<CombinacaoCor> cores = new ArrayList<>();
        
        static{
            cores.add(new CombinacaoCor("branco", "preto", "cinza"));
            cores.add(new CombinacaoCor("branco", "azul", "azul claro"));
            cores.add(new CombinacaoCor("amarelo", "branco", "amarelo claro/creme"));            
            cores.add(new CombinacaoCor("branco", "vermelho", "rosa"));
            cores.add(new CombinacaoCor("branco", "verde", "verde claro"));
            cores.add(new CombinacaoCor("branco", "laranja", "bege"));
            cores.add(new CombinacaoCor("branco", "roxo", "lilás"));
            cores.add(new CombinacaoCor("preto", "azul", "azul escuro"));
            cores.add(new CombinacaoCor("preto", "amarelo", "verde musgo / escuro"));
            cores.add(new CombinacaoCor("preto", "vermelho", "sangue"));
            cores.add(new CombinacaoCor("preto", "verde", "verde escuro"));
            cores.add(new CombinacaoCor("preto", "laranja", "marrom"));
            cores.add(new CombinacaoCor("preto", "roxo", "roxo escuro"));
            cores.add(new CombinacaoCor("azul", "amarelo", "verde"));
            cores.add(new CombinacaoCor("azul", "vermelho", "roxo"));
            cores.add(new CombinacaoCor("azul", "verde", "turquesa"));
            cores.add(new CombinacaoCor("azul", "roxo", "violeta / índigo"));
            cores.add(new CombinacaoCor("azul", "laranja", "marrom"));
            cores.add(new CombinacaoCor("amarelo", "vermelho", "laranja"));
            cores.add(new CombinacaoCor("amarelo", "verde", "verde oliva"));
            cores.add(new CombinacaoCor("amarelo", "roxo", "marrom"));
            cores.add(new CombinacaoCor("amarelo", "laranja", "laranjão"));
            cores.add(new CombinacaoCor("vermelho", "verde", "marrom"));
            cores.add(new CombinacaoCor("vermelho", "laranja", "tomate"));
            cores.add(new CombinacaoCor("vermelho", "roxo", "vinho"));
            cores.add(new CombinacaoCor("verde", "laranja", "marrom"));
            cores.add(new CombinacaoCor("verde", "roxo", "cinza"));
            cores.add(new CombinacaoCor("laranja", "roxo", "marrom"));
            
        }  
    }
    
    public static void main(String[] args) {
        MisturaCoresPOO mch = new MisturaCoresPOO();
    }
}
