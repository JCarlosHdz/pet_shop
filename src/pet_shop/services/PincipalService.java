/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.services;

import pet_shop.constants.GeneralConstants;
import pet_shop.domain.PaintMenu;
import pet_shop.persistences.TypePetsPersistence;
import pet_shop.utils.Utils;

/**
 * @description Main service that implements the logic.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class PincipalService implements PaintMenu{
    Utils utils = new Utils();
    CatsDogsService petsServices = new CatsDogsService();
    
    /**
     * Pet singleton instance.
     */
    TypePetsPersistence pets = TypePetsPersistence.getTypePetsPersistence();
    
    /**
     * @description Initial method that loads the first menu.
     */
    public void init(){
        int index = 0;
        this.paint(utils.getOptionsByIndex(pets.getListTypePets(), index), 
                GeneralConstants.EXIT, GeneralConstants.PET);
        int option = utils.captureOption();
        if(option != 0){
            if(utils.validateCapturedOption(pets.getListTypePets(), index, option)){
                petsServices.showSubMenu(option);
            }else{
                this.paintWithJump(GeneralConstants.NO_VALID);
                PincipalService.this.init();
            }
        }else{
            this.paintWithJump(GeneralConstants.GOODBYE);
        }
    }
}
