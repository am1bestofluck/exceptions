package dz3.exceptions;

/**
 * In case Words don't make sense.
 */
public class InputParseException extends IllegalArgumentException{

    public InputParseException(String message) {
        super(message);
    }
}