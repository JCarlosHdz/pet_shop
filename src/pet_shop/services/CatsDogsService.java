/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.services;

import java.util.List;
import pet_shop.constants.GeneralConstants;
import pet_shop.domain.PaintMenu;
import pet_shop.models.Cat;
import pet_shop.models.Dog;
import pet_shop.models.General;
import pet_shop.persistences.TypeCatsPersistence;
import pet_shop.persistences.TypeDogsPersistence;
import pet_shop.persistences.TypePetsPersistence;
import pet_shop.utils.Utils;

/**
 * @description Services for cats and dogs.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public class CatsDogsService implements PaintMenu {

    Utils utils = new Utils();

    /**
     * Cat and dog sigleton instance.
     */
    TypePetsPersistence pets = TypePetsPersistence.getTypePetsPersistence();
    TypeCatsPersistence cats = TypeCatsPersistence.getTypeCatsPersistence();
    TypeDogsPersistence dogs = TypeDogsPersistence.getTypeDogsPersistence();

    /**
     * @description Method that shows the submenu according to what is selected.
     * @param option {@link int}
     */
    public void showSubMenu(int option) {
        String message = option == 1 ? GeneralConstants.CAT_TYPE : GeneralConstants.DOG_TYPE;
        this.paint(utils.getOptionsByIndex(pets.getListTypePets(), option), GeneralConstants.BACK, message);
        int optionCD = utils.captureOption();
        if (optionCD != 0) {
            if (utils.validateCapturedOption(pets.getListTypePets(), option, optionCD)) {
                this.showMenuCatsDogs(option, optionCD);
            } else {
                this.paintWithJump(GeneralConstants.NO_VALID);
                CatsDogsService.this.showSubMenu(option);
            }
        } else {
            new PincipalService().init();
        }
    }

    /**
     * @description Method that shows the level 3 menu to select the breed of
     * the cat or dogs.
     * @param option {@link int}
     * @param optionCD {@link int}
     */
    public void showMenuCatsDogs(int option, int optionCD) {
        List<General> genericList = option == 1 ? cats.getListTypeCats() : dogs.getListTypeDogs();
        String message = option == 1 ? GeneralConstants.CAT_BREED : GeneralConstants.DOG_BREED;
        this.paint(utils.getOptionsByIndex(genericList, optionCD), GeneralConstants.BACK, message);
        int optionCatDogs = utils.captureOption();
        if (optionCatDogs != 0) {
            if (utils.validateCapturedOption(genericList, optionCD, optionCatDogs)) {
                this.buyPet(genericList, option, optionCD, optionCatDogs);
            } else {
                this.paintWithJump(GeneralConstants.NO_VALID);
                CatsDogsService.this.showMenuCatsDogs(option, optionCD);
            }
        } else {
            CatsDogsService.this.showSubMenu(option);
        }
    }

    /**
     * @description Method to make the purchase of the pet.
     * @param genericList {@link List<General>}
     * @param optionPet {@link int}
     * @param optionCatDog {@link int}
     * @param option {@link int}
     */
    public void buyPet(List<General> genericList, int optionPet, int optionCatDog, int option) {
        String petName = utils.getNameOptSelected(pets.getListTypePets(), 0, optionPet);
        String typeName = utils.getNameOptSelected(pets.getListTypePets(), optionPet, optionCatDog);
        String breedName = utils.getNameOptSelected(genericList, optionCatDog, option);
        this.paintWithJump(GeneralConstants.MSJ_DATA + petName.replace("s", "."));
        Cat cat;
        Dog dog;
        this.paintWithoutJump(GeneralConstants.NAME);
        String namePet = utils.captureText();
        this.paintWithoutJump(GeneralConstants.AGE);
        int agePet = utils.captureOption();
        this.paintWithoutJump(GeneralConstants.COLOR);
        String colorAge = utils.captureText();
        switch(optionPet){
            case 1:
                this.paintWithoutJump(GeneralConstants.JUMP_HEIGHT);
                float jumpHeigth = utils.captureFloat();
                this.paintWithoutJump(GeneralConstants.JUMP_LENGTH);
                float jumpLength = utils.captureFloat();
                cat = new Cat(jumpHeigth, jumpLength, namePet, agePet, colorAge);
                cat.sound(cat.SOUND);
                this.finalizeBuy(optionPet, optionCatDog, cat.toString());
                break;
            case 2:
                this.paintWithoutJump(GeneralConstants.WEIGTH);
                float weigth = utils.captureFloat();
                this.paintWithoutJump(GeneralConstants.BITE);
                int bite = utils.captureOption();
                dog = new Dog(weigth, bite == 1, namePet, agePet, colorAge);
                dog.sound(dog.SOUND);
                this.finalizeBuy(optionPet, optionCatDog, dog.toString());                
                break;
        }
    }
    
    /**
     * @description Method that terminates the process and returns to the beginning.
     * @param optionPet
     * @param optionCatDog
     * @param object 
     */
    public void finalizeBuy(int optionPet, int optionCatDog, String object){
        this.paintWithoutJump(GeneralConstants.FINALIZE);
        int opt = utils.captureOption();
        if (opt != 0) {
            this.paintWithJump(object);
            this.paintWithJump(GeneralConstants.CONGT);
            new PincipalService().init();
        }else{
            CatsDogsService.this.showMenuCatsDogs(optionPet, optionCatDog);
        }
    }
}
