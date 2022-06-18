/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop;

import pet_shop.services.PincipalService;

/**
 * @description Project main class.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class Main {

    /**
     * @description Main method of the class to execute the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PincipalService service = new PincipalService();
        service.init();
    }   
}
