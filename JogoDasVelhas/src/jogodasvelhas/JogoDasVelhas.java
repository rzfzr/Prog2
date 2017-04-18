/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodasvelhas;

/**
 *
 * @author rzfzr
 */
public class JogoDasVelhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

        Jogador j1;
        Jogador j2;
        
//        Screen s;
        
    public JogoDasVelhas() {
        j1 = new Jogador();
        j2 = new Jogador();
        
//        s = new Screen();
    }
    
    
    
    
    public void IniciarJogo(String n1,String s1, String n2,String s2){
        
//        Jogador j1 = new Jogador();
        j1.setNome(n1);
        j1.setSimbolo(s1);
//        
//        Jogador j2 = new Jogador();
        j1.setNome(n2);
        j1.setSimbolo(s2);
        
    }
    
    public void Jogada(String c11,String c12,String c13,
                       String c21,String c22,String c23,
                       String c31,String c32,String c33,
                       String ultimaJogada){
        
        
        if((c11==c12&&c12==c13&&c11!=" ")||(c21==c22&&c22==c23&&c21!=" ")||(c31==c32&&c32==c33&&c31!=" ")|| //linhas
           (c11==c21&&c21==c31&&c11!=" ")||(c12==c22&&c32==c13&&c12!=" ")||(c13==c23&&c12==c33&&c13!=" ")|| //colunas
           (c11==c22&&c22==c33&&c11!=" ")||(c13==c22&&c22==c31&&c13!=" ")){                    //diagonais
            //alguem ganhou
            
            Screen.Ganhou(ultimaJogada);
//            System.out.println("Cara ganhou");
            
            
        }else if(c11!=" "||c12!=" "||c13!=" "||
                 c21!=" "||c22!=" "||c23!=" "||
                 c31!=" "||c32!=" "||c33!=" "){
            //proxima jogada
            
           
        }else{
            //velha
            Screen.Velha();
        }
        
        
    }
}
