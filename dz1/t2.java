package dz1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * t2
 */
public class t2 {

    public static void main(String[] args) {
    }
    
    public static Integer[] declareArray(Integer size){
        
        Random tmp = new Random();
        Integer[] out = new Integer[size];
        for (int i = 0; i < out.length; i++) {
            out[i] = tmp.nextInt(100);
            
        
        }
        System.out.println(Arrays.toString(out));
        return out;
    }
    
    public static Integer[] declareArray(){
        Scanner local_Scanner = new Scanner(System.in);
        Integer size = 0;
        boolean isint = false;
            while (!isint)
            {
                try
                {   
                    System.out.println("Input array length");
                    size = local_Scanner.nextInt();
                    isint = true;
                }
                catch (NumberFormatException e){}
            
            }
        Integer[] out = declareArray(size);
        return out;

    }
    
    public static Integer[] _t2(Integer[] a, Integer[] b) throws UnsupportedOperationException{
        if (a.length != b.length)
        {
            throw new UnsupportedOperationException("arrays don't match");
        }
        Integer[] out = new Integer[a.length];
        for (int i = 0; i < b.length; i++) 
        {
            out[i] = a[i] - b[i]; // по типам должно быть всё схвачено, 
            // типы a[i] b[i] явно указаны как параметр t2
        }
        
        return out;

    }


}