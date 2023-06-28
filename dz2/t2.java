package dz2;
/**
 * t2
 */
public class t2 {
    public static String output = "<html> Этот кусок кода нужно не исправить а дополнить.<br>"
        + "\nПеременная intArray не указана, а значит мы можем получить"
        + "несоответствие типов и  NullPointerException,<br> но уже <i>после</i> того как сам "
        + "intArray будет объявлен и наполнен.</html>";
    public static void main(String[] args) {
            }
    public t2(){
        String output;
    }
    private void errorCode(){
        try {
    int d = 0;
    Character[] intArray = new Char[]{'1',}
    double catchedRes1 = intArray[8] / d;
    System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException  | NullPointerException e) {
    System.out.println("Catching exception: " + e);
    }
    
    }
    }
