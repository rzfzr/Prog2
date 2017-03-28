/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
/**
 *
 * @author rzfzr
 */
public class ParkingLot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
                int nSpots = 24;  //Escolhendo numero de vagas,
                    //que sera dividio em 2 grupos, 'e' e 'd'
        
        ArrayList<Spot> listSpot = new ArrayList<>();//lista de vagas
        
        
        
        
        
        
        
        
        for(int i=0; i<nSpots;i++){//inicializa vagas 
            Spot spot = new Spot();
        
            if(i<(nSpots/2)){//primeira metade vai pra 'e'
                spot.id=i;
                spot.block='e';
            }else{
                spot.id=i-(nSpots/2);
                spot.block='d';
            }
            listSpot.add(spot);
        }
        Scanner scan = new Scanner(System.in);
        int menuSelection = 0;
        char sideSelection=' ';
        int spotSelection;
        do {
                                     //listSpot get(0);
            System.out.println( 
                             "\n                Parking" + 
                             "\n        [1] Add       " + "   __    " + " 1 Hour = 4$" +
                             "\n        [2] Inspect   " + " _| #|_  " + "   More = 2$" +
                             "\n        [3] Remove    " + "|o___o_| " +
                             "\n        [0] Exit      " +
                             "\n  " +
                                     
                                     
                             "\n            ___________________________________________________________" +                                     
                             "\n Esquerda  | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 | 11 | 12 |" +        
                             "\n           |" 
                                     //TODO: Do a for loop using nSpots
                                     + listSpot.get(0)+ listSpot.get(1)+ listSpot.get(2)+ listSpot.get(3)+ listSpot.get(4)
                                     + listSpot.get(5)+ listSpot.get(6)+ listSpot.get(7)+ listSpot.get(8)
                                     + listSpot.get(9)+ listSpot.get(10)+ listSpot.get(11)+ 
                             "\n            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" +
                             "\n            ___________________________________________________________" +
                             "\n  Direita  | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 09 | 10 | 11 | 12 |" +        
                                      "\n           |" 
                                     //TODO: Do a for loop using nSpots
                                     + listSpot.get(12)+ listSpot.get(13)+ listSpot.get(14)+ listSpot.get(15)+ listSpot.get(16)
                                     + listSpot.get(17)+ listSpot.get(18)+ listSpot.get(19)+ listSpot.get(20)
                                     + listSpot.get(21)+ listSpot.get(22)+ listSpot.get(23)+     
                                     
                                     
                                     
                                    
                             "\n            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯" + 
                             "\n" +
                             "\n");
            
            // Desenho
            menuSelection = scan.nextInt();
            switch(menuSelection) {
                case 1:
                    System.out.println("Choose a side: ");
                    sideSelection = scan.next().charAt(0);//pega a primeira char da linha
                    //checar se o lado esta cheio ou nao
                    
                    System.out.println("Choose a spot: ");
                    spotSelection = scan.nextInt();
                    //checar se a vaga esta cheia ou nao
                        spotSelection --;
                    if(sideSelection=='d'){
                        spotSelection +=12;
                    }
                    System.out.println("Insert the car's plate: ");
                    String plate;
                    plate = scan.next();
                    
                    
//                    System.out.println("Insert the time: ");
//                    int time;
//                    time=scan.nextInt();
                    //now();
                    
                    
                    listSpot.get(spotSelection).use(plate);
                break;
                case 2:
                    System.out.println("Choose a side: ");
                    sideSelection = scan.next().charAt(0);//pega a primeira char da linha
                    
                    System.out.println("Choose a spot: ");
                    spotSelection = scan.nextInt();
                    //System.out.println("Vaga "+sideSelection+spotSelection);
                    
                        spotSelection --;
                    if(sideSelection=='d'){
                        spotSelection +=12;
                    }
                    
                    System.out.println("Vaga "+sideSelection+(spotSelection+1));
                    System.out.println("Placa = " + listSpot.get(spotSelection).carPlate);
                    
                    System.out.println("Hora de entrada = " + listSpot.get(spotSelection).enterHour);
                    //listSpot.get(spotSelection).use();
                break;
                
                case 3:
                    System.out.println("Choose a side: ");
                    sideSelection = scan.next().charAt(0);//pega a primeira char da linha
                    
                    System.out.println("Choose a spot: ");
                    spotSelection = scan.nextInt();
                    //System.out.println("Vaga "+sideSelection+spotSelection);
                    
                        spotSelection --;
                    if(sideSelection=='d'){
                        spotSelection +=12;
                    }
//                    System.out.println("Insert the time: ");
                    //time=scan.nextInt();
//                    System.out.println("Vaga "+sideSelection+(spotSelection+1));
                    
                    
                    listSpot.get(spotSelection).unUse();
                    
                    System.out.println("Hora de entrada = " + listSpot.get(spotSelection).enterHour);
                    
                    System.out.println("Hora de saida = " + listSpot.get(spotSelection).exitHour);
                    
                    System.out.println("Total de horas = " + listSpot.get(spotSelection).totalHours);
                    
                    System.out.println("Total em real = " + listSpot.get(spotSelection).cust);
                    //System.out.println("Horas "+listSpot.get(spotSelection+1).calcHours());
                    break;
            }
        } while(menuSelection != 0);
            
       
    }
    
}
