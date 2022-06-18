/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.domain;

/**
 * @description Interface with default methods (it is not necessary to implement it).
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public interface GeneralServices {
    /**
     * @description Default method to paint jump lines on the screen.
     * @param message {@link String}
     */
    public default void paintWithJump(String message){
        System.out.println(message);
    }
    
    /**
     * @description Default method to paint non-jumping lines on the screen.
     * @param message {@link String}
     */
    public default void paintWithoutJump(String message){
        System.out.print(message);
    }
}
