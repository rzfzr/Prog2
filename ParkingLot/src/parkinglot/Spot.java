/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Spot {//vaga

    /**
     *
     * @author rzfzr
     */
    boolean isUsed;//ocupado
    char block;//bloco, lado
    int id;//numero vaga
    //Car car;//objeto carro
    String carPlate;
    //int enterTime;//horario padrao militar
    //int exitTime;//ex: 1205 = 12:05
//    LocalDateTime enterTime;
//    LocalDateTime exitTime;
    int enterHour;
    int exitHour;

    Spot() {
        isUsed = false;
        block = ' ';
        id = 0;
        //car = new Car();
        carPlate = "";
        enterHour = 0;
        exitHour= 0;
//        enterTime = 0;
//        exitTime = 0;
    }

    void use(String plate) {//ocupa , int time

        isUsed = true;
        carPlate = plate;
        
        enterHour= Calendar.HOUR_OF_DAY;
//        enterTime = LocalDateTime.now();
        //enterTime = time;
    }

    void unUse() {//desocupa
        isUsed = false;
        carPlate = "";
        
        
        exitHour = Calendar.HOUR_OF_DAY;
        //exitTime = time;
//        exitTime = LocalDateTime.now();
calcHours();
    }

//    String calcHours(){
//        String enterTimeS = Integer.toString(enterTime);
//        String exitTimeS = Integer.toString(exitTime);
//        
//        String enterHourS = enterTimeS.substring(0,2);
//        int enterHour = Integer.parseInt(enterHourS);
//        
//        String enterMinuteS = enterTimeS.substring(2,4);
//        int enterMinute = Integer.parseInt(enterMinuteS);
//        
//        
//        String exitHourS = enterTimeS.substring(0,2);
//        int exitHour = Integer.parseInt(exitHourS);
//        
//        String exitMinuteS = enterTimeS.substring(2,4);
//        int exitMinute = Integer.parseInt(exitMinuteS);
//        
//        int resultMinute = exitMinute - enterMinute;
//        int resultHour = exitHour - enterHour;
//        
//        String resultMinuteS = Integer.toString(resultMinute);
//        String resultHourS = Integer.toString(resultHour);
//        
//        
//       return (resultHourS + resultMinuteS); 
//    }
    int totalHours;
    int cust = 4;
    
    void calcHours(){
        totalHours= (exitHour-enterHour);
        calcMoney();
    }

    void calcMoney() {
        while(totalHours>=1){
            cust+=2;
        }
        
//        while (totalHours > 2) {
//            totalHours--;
//            cust += 2;
//        }
//        if (totalHours > 0) {
//            totalHours--;
//            cust += 4;
//        }
    }

    String getSpotstate() {
        if (isUsed) {
            return " ## |";
        } else {
            return "    |";
        }

    }

    @Override//override de toString
    public String toString() {
        return this.getSpotstate();
    }

}
