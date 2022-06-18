/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.domain;

/**
 * @description action pets.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public interface ActionPet extends GeneralServices{
    /**
     * @description Method to print the sound of the mascot.
     * @param sound {@link String}
     */
    public default void sound(String sound){
        this.paintWithJump(sound);
    }
}
