/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.persistences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pet_shop.dictionaries.TypePets;
import pet_shop.models.General;

/**
 * @description Singleton class that stores the list of pets.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class TypePetsPersistence {
    private List<General> listTypePets = null;
    private static TypePetsPersistence instance;

    private TypePetsPersistence(List<General> listTypePets) {
        this.listTypePets = listTypePets;
    }
    
    public static TypePetsPersistence getTypePetsPersistence(){
        if(instance == null){
            /**
            * Stream which gets the list of pets from the dictionary.
            */
           List<General> lisTypePets = Arrays.asList(TypePets.values())
                       .stream().map(e -> new General(e.getIndex(), e.getOption(), e.getName()))
                       .collect(Collectors.toList());
            instance = new TypePetsPersistence(lisTypePets);
        }
        return instance;
    }

    public List<General> getListTypePets() {
        return listTypePets;
    }

    public void setListTypePets(List<General> listTypePets) {
        this.listTypePets = listTypePets;
    }
}
