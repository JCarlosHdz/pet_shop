/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.persistences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pet_shop.dictionaries.TypeDogs;
import pet_shop.models.General;

/**
 * @description Singleton class that stores the list of dogs.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class TypeDogsPersistence {
    private List<General> listTypeDogs = null;
    private static TypeDogsPersistence instance;

    private TypeDogsPersistence(List<General> listTypeDogs) {
        this.listTypeDogs = listTypeDogs;
    }
    
    public static TypeDogsPersistence getTypeDogsPersistence(){
        if(instance == null){
            /**
            * Stream which gets the list of dogs from the dictionary.
            */
            List<General> lisTypeDogs = Arrays.asList(TypeDogs.values())
                       .stream().map(e -> new General(e.getIndex(), e.getOption(), e.getName()))
                       .collect(Collectors.toList());
            instance = new TypeDogsPersistence(lisTypeDogs);
        }
        return instance;
    }

    public List<General> getListTypeDogs() {
        return listTypeDogs;
    }

    public void setListTypeDogs(List<General> listTypeDogs) {
        this.listTypeDogs = listTypeDogs;
    }
}
