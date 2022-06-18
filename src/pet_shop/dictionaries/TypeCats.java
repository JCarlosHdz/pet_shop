/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.dictionaries;

/**
 * @description Dictionary containing all types of cats.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public enum TypeCats {
    //Hairless
    ES(1, 1, "Esfinge"),
    EL(1, 2, "Elfo"),
    DO(1, 3, "Donskoy"),
    //Short Hair
    AZ(2, 1, "Azul ruso"),
    BR(2, 2, "Británico"),
    MN(2, 3, "Manx"),
    DR(2, 4, "Devon Rex"),
    //Long Hair
    AN(3, 1, "Angora"),
    HM(3, 2, "Himalayo"),
    BL(3, 3, "Balinés"),
    SM(3, 4, "Somali");
    
    private int index;
    private int option;
    private String name;

    private TypeCats(int index, int option, String name) {
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
