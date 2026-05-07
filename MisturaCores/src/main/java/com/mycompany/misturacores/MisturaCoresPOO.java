/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misturacores;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Usuário do Windows
 */
public class MisturaCoresPOO {

    public MisturaCoresPOO() {
        
        int opcao=-1;
        
        while(opcao!=0){
            
            
            
        }
    }
    
    public static class BancoDeCores{
        
        public static Map<String, String> combinacaoCor = new HashMap<>();
        public static Map<String, String> consultarCor = new HashMap<>();
        
        static{
            combinacaoCor.put("brancopreto", "cinza");
            combinacaoCor.put("azulbranco", "azul claro");
            combinacaoCor.put("amarelobranco", "amarelo claro / creme");
            
            bancoDeMisturas.add(new Mistura("branco", "vermelho", "rosa"));
            bancoDeMisturas.add(new Mistura("branco", "verde", "verde claro"));
            bancoDeMisturas.add(new Mistura("branco", "laranja", "bege"));
            bancoDeMisturas.add(new Mistura("branco", "roxo", "lilás"));

            bancoDeMisturas.add(new Mistura("preto", "azul", "azul escuro"));
            bancoDeMisturas.add(new Mistura("preto", "amarelo", "verde musgo / escuro"));
            bancoDeMisturas.add(new Mistura("preto", "vermelho", "sangue"));
            bancoDeMisturas.add(new Mistura("preto", "verde", "verde escuro"));
            bancoDeMisturas.add(new Mistura("preto", "laranja", "marrom"));
            bancoDeMisturas.add(new Mistura("preto", "roxo", "roxo escuro"));

            bancoDeMisturas.add(new Mistura("azul", "amarelo", "verde"));
            bancoDeMisturas.add(new Mistura("azul", "vermelho", "roxo"));
            bancoDeMisturas.add(new Mistura("azul", "verde", "turquesa"));
            bancoDeMisturas.add(new Mistura("azul", "roxo", "violeta / índigo"));
            bancoDeMisturas.add(new Mistura("azul", "laranja", "marrom"));

            bancoDeMisturas.add(new Mistura("amarelo", "vermelho", "laranja"));
            bancoDeMisturas.add(new Mistura("amarelo", "verde", "verde oliva"));
            bancoDeMisturas.add(new Mistura("amarelo", "roxo", "marrom"));
            bancoDeMisturas.add(new Mistura("amarelo", "laranja", "laranjão"));

            bancoDeMisturas.add(new Mistura("vermelho", "verde", "marrom"));
            bancoDeMisturas.add(new Mistura("vermelho", "laranja", "tomate"));
            bancoDeMisturas.add(new Mistura("vermelho", "roxo", "vinho"));

            bancoDeMisturas.add(new Mistura("verde", "laranja", "marrom"));
            bancoDeMisturas.add(new Mistura("verde", "roxo", "cinza"));

            bancoDeMisturas.add(new Mistura("laranja", "roxo", "marrom"));
            
        }
        
        
        
    }
    
    public static void main(String[] args) {
        MisturaCoresPOO mch = new MisturaCoresPOO();
    }
}
