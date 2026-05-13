/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.misturacores;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Usuário do Windows
 */
public class MisturaCoresHEX {

    public MisturaCoresHEX() {
        
        
        
    }
    
    public static class CorHexadecimal{
        
        String nomeCor;
        int CodCor;

        public CorHexadecimal(String nomeCor, int CodCor) {
            this.nomeCor = nomeCor;
            this.CodCor = CodCor;
        }
        
    }
    
    public static class BancoDeCores{
        
        public static ArrayList<CorHexadecimal> cores = new ArrayList<>();
        
        static{
            cores.add(new CorHexadecimal(" ", 1));
        }  
    }
    
    public static void main(String[] args) {
        MisturaCoresHEX mchex = new MisturaCoresHEX();
    }
    
}
