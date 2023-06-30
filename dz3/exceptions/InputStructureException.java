package dz3.exceptions;

/**
 * In case We got invalid amount of words.
 */
public class InputStructureException extends IndexOutOfBoundsException{
    public InputStructureException(String message) {
        super(message);
    }
    
}