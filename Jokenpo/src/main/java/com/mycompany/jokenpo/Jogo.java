/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário do Windows
 */
public class Jogo{
    
    int modoJogo;

    public Jogo() {
        
    }
    
    public void comecarJogo(){
        if(modoJogo==1){
            
            Random random = new Random();
            int jogadaPC = random.nextInt(3)+1;
            
        }
        else if(modoJogo==3){
            for(int i=0; i<3; i++){
                Random random = new Random();
                int jogadaPC = random.nextInt(3)+1;
            }            
        }
        else if(modoJogo==5){//usando else if pq ainda pretendo adicionar mais um modo
            for(int i=0; i<5; i++){
                Random random = new Random();
                int jogadaPC = random.nextInt(3)+1;
            }         
        }
    }
    
    public void setModoJogo(int modoJogo){
            this.modoJogo = modoJogo;
        }
    
    public int getModoJogo(){
            return modoJogo;
        }
}
