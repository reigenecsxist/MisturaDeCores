/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.misturacores;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuário do Windows
 */
public class MisturaCoresSimples {

    public MisturaCoresSimples() {
        
        int opcao = -1;
        
        while(opcao!=0){
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("-MISTURA DE CORES-\nEscolha uma opção:\n\n1 - Misturar duas cores\n2 - Descobrir uma combinação\n0 - Sair"));
            
            switch(opcao){
                case 1:
                    String cor1 = JOptionPane.showInputDialog("Digite a primeira cor para combinação:");
                    String cor2 = JOptionPane.showInputDialog("Digite a segunda cor para combinação:");
                    String resultado;
                    
                    if(cor1.compareToIgnoreCase(cor2)<0)
                        resultado = cor1.toLowerCase()+cor2.toLowerCase();
                    else
                        resultado = cor2.toLowerCase()+cor1.toLowerCase();
                    
                    if(cor1.equals(cor2)) JOptionPane.showMessageDialog(null, "A combinação entre essas cores resulta em "+cor1.toUpperCase());
                    
                    switch(resultado){
                        case "brancopreto":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor CINZA");
                            break;
                        case "brancoazul":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor AZUL CLARO");
                            break;
                        case "brancoamarelo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor AMARELO CLARO/CREME");
                            break;
                        case "brancovermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor ROSA");
                            break;
                        case "brancoverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VERDE CLARO");
                            break;
                        case "brancolaranja":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor BEGE");
                            break;
                        case "brancoroxo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor LILÁS");
                            break;
                        case "azulpreto":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor AZUL ESCURO");
                            break;
                        case "amarelopreto":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VERDE MUSGO/ESCURO");
                            break;
                        case "pretovermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor SANGUE");
                            break;
                        case "pretoverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VERDE ESCURO");
                            break;
                        case "laranjapreto":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        case "pretoroxo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor ROXO ESCURO");
                            break;
                        case "amareloazul":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VERDE");
                            break;
                        case "azulvermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor ROXO");
                            break;
                        case "azulverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor TURQUESA");
                            break;
                        case "azulroxo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VIOLETA/INDIGO");
                            break;
                        case "azullaranja":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        case "amarelovermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor LARANJA");
                            break;
                        case "amareloverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VERDE OLIVA");
                            break;
                        case "amareloroxo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        case "amarelolaranja":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor LARANJÃO");
                            break;
                        case "verdevermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        case "laranjavermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor TOMATE");
                            break;
                        case "roxovermelho":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor VINHO");
                            break;
                        case "laranjaverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        case "roxoverde":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor CINZA");
                            break;
                        case "laranjaroxo":
                            JOptionPane.showMessageDialog(null, "A combinação entre "+cor1.toUpperCase()+" e "+cor2.toUpperCase()+" resulta na cor MARROM");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opções indisponíveis");
                            break;
                    }
                    break;
                    
                case 2:
                    String cor = JOptionPane.showInputDialog("Digite a cor que deseja fazer:");
                    
                    switch(cor.toLowerCase().trim()){
                        case "cinza":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e PRETO ou VERDE e ROXO.");
                            break;
                        case "amareloclaro":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e AMARELO.");
                            break;
                        case "creme":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e AMARELO.");
                            break;
                        case "rosa":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e VERMELHO.");
                            break;
                        case "verdeclaro":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e VERDE.");
                            break;
                        case "bege":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e LARANJA.");
                            break;
                        case "lilas":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e ROXO.");
                            break;
                        case "lilás":
                            JOptionPane.showMessageDialog(null, "Misture BRANCO e ROXO.");
                            break;
                        case "azulescuro":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e AZUL.");
                            break;
                        case "verdemusgo":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e AMARELO.");
                            break;
                        case "verdeescuro":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e AMARELO ou PRETO e VERDE.");
                            break;
                        case "sangue":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e VERMELHO.");
                            break;
                        case "marrom":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e LARANJA ou AZUL e LARANJA ou AMARELO e ROXO ou VERMELHO e VERDE ou VERDE e LARANJA ou LARANJA e ROXO.");
                            break;
                        case "roxoescuro":
                            JOptionPane.showMessageDialog(null, "Misture PRETO e ROXO.");
                            break;
                        case "verde":
                            JOptionPane.showMessageDialog(null, "Misture AZUL e AMARELO.");
                            break;
                        case "roxo":
                            JOptionPane.showMessageDialog(null, "Misture AZUL e VERMELHO.");
                            break;
                        case "turquesa":
                            JOptionPane.showMessageDialog(null, "Misture AZUL e VERDE.");
                            break;
                        case "violeta":
                            JOptionPane.showMessageDialog(null, "Misture AZUL e ROXO.");
                            break;
                        case "indigo":
                            JOptionPane.showMessageDialog(null, "Misture AZUL e ROXO.");
                            break;
                        case "laranja":
                            JOptionPane.showMessageDialog(null, "Misture AMARELO e VERMELHO.");
                            break;
                        case "verdeoliva":
                            JOptionPane.showMessageDialog(null, "Misture AMARELO e VERDE.");
                            break;
                        case "laranjão":
                            JOptionPane.showMessageDialog(null, "Misture AMARELO e LARANJA.");
                            break;
                        case "tomate":
                            JOptionPane.showMessageDialog(null, "Misture VERMELHO e LARANJA");
                            break;
                        case "vinho":
                            JOptionPane.showMessageDialog(null, "Misture VERMELHO e ROXO.");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Cor indisponível.");
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        MisturaCoresSimples mc = new MisturaCoresSimples();
    }
}
