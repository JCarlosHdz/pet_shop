/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.models;

/**
 * @descripcion General model.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class General {
    private int index;
    private int option;
    private String name;

    public General() {
    }

    public General(int index, int option, String name) {
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
