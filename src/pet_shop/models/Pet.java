/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.models;

import pet_shop.domain.ActionPet;

/**
 * @description Pet model.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class Pet implements ActionPet{
    private String name;
    private int age;
    private String color;

    public Pet() {
    }

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\n" +
                "Edad: " + age + "\n" +
                "Color: " + color + "\n";
    }
    
}
