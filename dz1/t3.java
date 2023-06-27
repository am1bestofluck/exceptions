package dz1;
/**
 * t3
 */
public class t3 {

    public static void main(String[] args) {
        
    }
    
    public static String[] _t3(Integer[] a, Integer[] b) 
        throws UnsupportedOperationException, ArithmeticException
        {
            if (a.length != b.length)
            {
                throw new UnsupportedOperationException("arrays don't match");
            }


            String [] out = new String[a.length];
            for (int i = 0; i < out.length; i++) {
                    if (b[i] == 0){
                        throw new ArithmeticException("деление на 0");
                    }
                    out[i] = String.format("%.2f", (double)a[i]/b[i]);
                    

                
            }
            return out;
    }
}