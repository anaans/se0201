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
public class WindowsFactory implements GUIFactory {
    
     @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
