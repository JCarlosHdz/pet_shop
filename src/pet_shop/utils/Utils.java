/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.utils;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import pet_shop.models.General;

/**
 * @description Program utilities.
 * @author Juan Carlos Hernández
 */
public class Utils{
    
    Scanner scn = new Scanner(System.in);
    
    /**
     * @description General method to capture the option from the console.
     * @return opt {@link int}
     */
    public int captureOption(){
        return scn.nextInt();
    }
    
    /**
     * @description General method to capture text from the console.
     * @return str {@link String}
     */
    public String captureText(){
        scn.nextLine();
        return scn.nextLine();
    }
    
    /**
     * @description General method to capture float from the console.
     * @return str {@link String}
     */
    public float captureFloat(){
        return scn.nextFloat();
    }
    
    /**
     * @description Method that validates if the selected option is in the index
     * of the list objects.
     * @param genericList {@link List<General>}
     * @param index {@link int}
     * @param option {@link int}
     * @return {@link boolean}
     */
    public boolean validateCapturedOption(List<General> genericList, int index, int option){
        return genericList.stream().filter(generic -> (generic.getIndex() == index && 
                generic.getOption() == option)).count() > 0;
    }
    
    /**
     * @description Method to get only the options with the selected index.
     * @param genericList {@link List<General>}
     * @param option {@link int}
     * @return {@link List<General>}
     */
    public List<General> getOptionsByIndex(List<General> genericList, int option){
        return genericList.stream().filter(generic -> generic.getIndex() == option).collect(Collectors.toList());
    }
    
    /**
     * @description Method to get name of selected option.
     * @param genericList {@link List<General>}
     * @param index {@link int}
     * @param option {@link int}
     * @return {@link String}
     */
    public String getNameOptSelected(List<General> genericList, int index, int option){
        return genericList.stream().filter(generic -> (generic.getIndex() == index && 
                generic.getOption() == option)).collect(Collectors.toList()).get(0).getName();
    }
   
}
