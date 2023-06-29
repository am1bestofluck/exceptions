package dz2;

import java.awt.im.InputContext;
import java.security.InvalidParameterException;

/**
 * t4
 */
public class t4 {
    public static void main(String[] args) {

    }

    public String _t4(String inpString) throws InvalidParameterException {
        if (inpString.isEmpty() || inpString.isBlank() || inpString == null) {
            throw new InvalidParameterException("blank lines forbidden.");

        }

        return inpString;
    }
}