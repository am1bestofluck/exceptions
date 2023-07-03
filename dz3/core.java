package dz3;

import java.util.NoSuchElementException;
import java.util.Scanner;

import dz3.exceptions.InputParseException;
import dz3.exceptions.InputStructureException;

import org.json.simple.JSONObject; // https://stackoverflow.com/questions/50232557/visual-studio-code-java-extension-how-to-add-a-jar-to-classpath

/**
 * 1. юзер запускает программу двойным кликом.()
 * 2. внутри core запускается repl
 * 2.1 repl принимает "add" и "qqq"
 * 2.2 "qqq" выходит из программы
 * 2.3 "add" начинает __РУТИНУ__
 * 
 * 3. __РУТИНА__(core)
 * 3.1 пока всё плохо: опрашиваем пользователя
 * всё плохо = {в имени/фамилии цифры} или {в телефоне буквы}
 * 3.2 отдаём её в json_editor
 * 
 * 4. делаем из строки json
 *
 * 5. отдаём json в zip-editor # не отдаём ничего никуда. Впереди ад
 * "контейнеризации", нужно
 * с этим быстренько разобраться.
 */

public class core {

    public static void main(String[] args) {
        core a = new core();
        String[] validString = core.repl();
        System.out.println(validString);
        json_editor jse = new json_editor(validString);
        jse.getFile();
    }

    public static String[] repl() {
        Scanner localScanner = new Scanner(System.in);
        String onlyDigits = "\\d+";
        String noDigits = "\\D+";
        String temp = new String();
        String[] subStrings = new String[4];

        while (true) {
            System.out.println("Введи пож 'Фамилию' 'Имя' 'Отчество' 'Номер телефона' через пробелы");
            try {
                temp = localScanner.nextLine();
                subStrings = temp.split(" ");
                if (subStrings.length != 4) {
                    throw new InputStructureException("через пробел <Ф> <И> <О> <телефон>");
                }
                if (!subStrings[0].matches(noDigits)) {
                    throw new InputParseException("некорректный формат ФАМИЛИИ");
                }
                if (!subStrings[1].matches(noDigits)) {
                    throw new InputParseException("некорректный формат ИМЕНИ");
                }
                if (!subStrings[2].matches(noDigits)) {
                    throw new InputParseException("некорректный формат ОТЧЕСТВА");
                }
                if (!subStrings[3].matches(onlyDigits)) {
                    throw new InputParseException("некорректный формат НОМЕРА ТЕЛЕФОНА");
                }

                return subStrings;
            } catch (InputStructureException | InputParseException e) {
                System.out.println(e.getLocalizedMessage());
            } catch (NoSuchElementException e) {
                System.out.println("Ну отказался так отказался :)");
            }
        }

    }

}
