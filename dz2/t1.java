package dz2;

import java.util.InputMismatchException;

/**
 * exceptions2
 */
public class t1 {

    public static void main(String[] args) {
        t1 a = new t1();
        String qwe = a._t1("4,12");
        System.out.println(qwe);
        qwe = a._t1("5.67");
        System.out.println(qwe);
        qwe = a._t1("567");
        System.out.println(qwe);
        qwe = a._t1("waste");
        System.out.println(qwe);
    }

    public String _t1(String in) {
        String out = "Пож введи ещё раз";
        in = in.replace(',', '.');
        try {
            out = String.format("Ввведено и пропущено: %f", Float.parseFloat(in));

        } catch (NumberFormatException | InputMismatchException | NullPointerException e) {
        }
        return out;

    }

}