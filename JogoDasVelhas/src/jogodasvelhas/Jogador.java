package jogodasvelhas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rzfzr
 */
public class Jogador {

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
    
    private String nome;
    private String simbolo;
    
    Jogador(){
        nome="";
        simbolo="";
        
    }
//    Jogador(String n, String s){
//        nome=n;
//        simbolo=s;
//        
//    }
    
    
}
