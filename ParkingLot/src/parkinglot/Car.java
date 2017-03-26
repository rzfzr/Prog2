/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

/**
 *
 * @author rzfzr
 */
public class Car {

    String clientName;//nome
    String carPlate;//placa
    int enterTime;//horario padrao militar
    int exitTime;//ex: 1205 = 12:05
//    String enterDate; //nao vou levar em consideracao,
//    String exitDate; //assumindo o mesmo dia

    public Car() {
        clientName = "";
        carPlate = "";
        enterTime = 0;
        exitTime = 0;
//        enterDate="";
//        exitDate="";

    }

}
