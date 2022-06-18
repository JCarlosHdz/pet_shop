/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.dictionaries;

/**
 * @description Dictionary containing all types of dogs.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public enum TypeDogs {
    //Small breeds
    CN(1, 1, "Caniche"),
    YK(1, 2, "Yorkshire"),
    TR(1, 3, "Terrie"),
    SN(1, 4, "Schnauzer"),
    CH(1, 5, "Chihuahua"),
    //Medium breeds
    CL(2, 1, "Collie"),
    DM(2, 2, "Dalmata"),
    BD(2, 3, "Bulldog"),
    GG(2, 4, "Galgo"),
    SB(2, 5, "Sabueso"),
    //Large breeds
    PA(3, 1, "Pastor aleman"),
    DB(3, 2, "Doberman"),
    RW(3, 3, "Rotweiller");
    
    private int index;
    private int option;
    private String name;

    private TypeDogs(int index, int option, String name) {
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
