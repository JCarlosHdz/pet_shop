/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.models;

/**
 * @description Cat model.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class Cat extends Pet{
    public final String SOUND = "Los gatos maúllan y ronrronean.";
    private float jumpHeight;
    private float jumpLength;
    
    public Cat() {
    }

    public Cat(float jumpHeight, float jumpLength) {
        this.jumpHeight = jumpHeight;
        this.jumpLength = jumpLength;
    }

    public Cat(float jumpHeight, float jumpLength, String name, int age, String color) {
        super(name, age, color);
        this.jumpHeight = jumpHeight;
        this.jumpLength = jumpLength;
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public float getJumpLength() {
        return jumpLength;
    }

    public void setJumpLength(float jumpLength) {
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "\nGATO:\n" + 
                super.toString() +
                "Altura Salto: " + jumpHeight + "\n" +
                "Longitud Salto: " + jumpLength;
    }
    
}
