/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.persistences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pet_shop.dictionaries.TypeCats;
import pet_shop.models.General;

/**
 * @description Singleton class that stores the list of cats.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class TypeCatsPersistence {
    private List<General> listTypeCats = null;
    private static TypeCatsPersistence instance;

    private TypeCatsPersistence(List<General> listTypeCats) {
        this.listTypeCats = listTypeCats;
    }
    
    public static TypeCatsPersistence getTypeCatsPersistence(){
        if(instance == null){
            /**
            * Stream which gets the list of cats from the dictionary.
            */
            List<General> lisTypeCats = Arrays.asList(TypeCats.values())
                       .stream().map(e -> new General(e.getIndex(), e.getOption(), e.getName()))
                       .collect(Collectors.toList());
            instance = new TypeCatsPersistence(lisTypeCats);
        }
        return instance;
    }

    public List<General> getListTypeCats() {
        return listTypeCats;
    }

    public void setListTypeCats(List<General> listTypeCats) {
        this.listTypeCats = listTypeCats;
    }
}
