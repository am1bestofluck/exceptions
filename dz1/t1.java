package dz1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * t1
 */
public class t1 {
    public static void main(String[] args) {
        
    }
    public  static Integer _t1() throws IllegalArgumentException, FileNotFoundException, NoSuchElementException{
        Integer output = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String filename = "";
        System.out.println("Write filename to read.\n"
         + "'right.txt' for correct path\n"
         + "'wrong.txt' for invalid content");
        try 
        {
            filename = input.nextLine();
        }
        catch (NoSuchElementException e )
        {
            throw new NoSuchElementException("Interrupted by user..."
            + "у меня получалось делать такой перехват что"
            +" программа после кртл ц не падала до конца... потом испортилось опять :(");
        }
        if ( !filename.endsWith(".txt") || filename.length() <= 3 )
        {
            throw new IllegalArgumentException("Filename must point to txt file");
            
        }
        File read_it = new File("dz1\\"+filename);
        try
        {
        Scanner FileReader = new Scanner(read_it);
        
        while (FileReader.hasNextLine()) {
            String data = FileReader.nextLine();
            for (int i = 0; i < data.split(" ").length; i++) {
                try{
                    numbers.add(Integer.valueOf(data.split(" ")[i]));}
                catch (NumberFormatException e){
                    throw new NumberFormatException("Can't parse content of file!");
                }
            }}}
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException("No such file");
        }
        for (Integer integer : numbers) {
            output += integer;
        }
        return output;

    }
    
}