/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.dictionaries;

/**
 * @description Dictionary containing all types of pets and sub types.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public enum TypePets {
    //Pets
    G(0, 1, "Gatos"),
    P(0, 2, "Perros"),
    //Cats
    SP(1, 1, "Sin Pelo"),
    PC(1, 2, "Pelo Corto"),
    PL(1, 3, "Pelo Largo"),
    //Dogs
    GD(2, 1, "Pequeño"),
    MD(2, 2, "Mediano"),
    PQ(2, 3, "Grande");
    
    private int index;
    private int option;
    private String name;

    private TypePets(int index, int option, String name) {
        this.index = index;
        this.option = option;
        this.name = name;
    }
    
    

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
