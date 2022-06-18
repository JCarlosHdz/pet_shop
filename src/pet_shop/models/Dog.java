/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.models;

/**
 * @description Dog model.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class Dog extends Pet{
    public final String SOUND = "Los perros ladran.";
    private final String Y = "Si";
    private final String N = "No";
    private float weight;
    private boolean bites;

    public Dog() {
    }

    public Dog(float weight, boolean bites) {
        this.weight = weight;
        this.bites = bites;
    }

    public Dog(float weight, boolean bites, String name, int age, String color) {
        super(name, age, color);
        this.weight = weight;
        this.bites = bites;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean getBites() {
        return bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }

    @Override
    public String toString() {
        return "\nPERRO:\n" + 
                super.toString() +
                "Peso: " + weight + "\n" +
                "Muerde: " + (bites ? Y : N);
    }
    
}
