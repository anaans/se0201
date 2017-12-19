/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrika;

/**
 *
 * @author ana
 */
public class MacFactory implements GUIFactory {
    
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacCheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
