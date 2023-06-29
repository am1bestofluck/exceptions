package dz2;

import java.io.FileNotFoundException;

/**
 * t3
 */
public class t3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);

    }

    public String _t3() {
        String out = "<html>"
                + "Ну поехали.<br>"
                + "* throws Exception - ни о чём. Если пробрасываешь - уточняй что фиксить.<br>"
                + "* первый кэч - throwable это слишком обобщённо. Круче только object :). Так же мы этим как бы ловим error'ы. Чего делать не должны?<br>"
                + "* Дальше - по иерархии, если мы уж ловим все Exception'ы то в последнюю очередь."

                + "</html>";
        return out;

    }
}