package dz2;

/**
 * t2
 */
public class t2 {
    public static String output = "<html> Этот кусок кода нужно не исправить а дополнить.<br>"
            + "\nПеременная intArray не указана, а значит мы можем получить "
            + "несоответствие типов и  NullPointerException, или ArrayIndexOutOfBoundsException <br> но уже <i>после</i> того как сам "
            + "intArray будет объявлен и наполнен.</html>";

    public static void main(String[] args) {
        t2 a = new t2();
        a.errorCode();
    }

    public String _t2() {
        return t2.output;
    }

    private void errorCode() {
        try {
            int d = 1;
            Character[] intArray = new Character[] { 'a', '2', '3', '4', '5', '6', '7', '8', 'A' };
            // джава что ты делаешь? Почему можно поделить букву на число??
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
