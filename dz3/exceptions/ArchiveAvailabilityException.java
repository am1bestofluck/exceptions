package dz3.exceptions;

import java.io.FileNotFoundException;

/**
 * Archive is corrupted or missing. 
 * 
 */
public class ArchiveAvailabilityException extends FileNotFoundException {

    public ArchiveAvailabilityException(String message){
        super(message);
    }
    
}