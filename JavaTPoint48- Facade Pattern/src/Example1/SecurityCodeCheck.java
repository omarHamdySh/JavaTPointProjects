/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {

        if (secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }

}
