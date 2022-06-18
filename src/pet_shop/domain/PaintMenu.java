/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_shop.domain;

import java.util.List;
import pet_shop.constants.GeneralConstants;
import pet_shop.models.General;

/**
 * @description Interface with default method to paint on screen.
 * @author Juan Carlos Hernández
 * @date 10/06/22
 */
public interface PaintMenu extends GeneralServices{
    /**
     * @description Default method to paint menus on screen.
     * @param genericList {@link List<General>}
     * @param lastOption {@link String}
     * @param message {@link String}
     */
    public default void paint(List<General> genericList, String lastOption, String message){
        this.paintWithJump(GeneralConstants.SELECTION + message);
        genericList.forEach(general -> {
            this.paintWithJump("[" + general.getOption() + "] - "+ general.getName());
        });
        this.paintWithJump(lastOption);
        this.paintWithoutJump(GeneralConstants.OPTION);
    }
}
