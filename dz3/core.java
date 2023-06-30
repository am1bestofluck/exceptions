package dz3;
import java.util.Scanner;

import dz3.exceptions.InputParseException;
import dz3.exceptions.InputStructureException;
/**
 * 1. юзер запускает программу двойным кликом.()
 * 2. внутри core запускается repl
 *      2.1 repl принимает "add" и "qqq"
 *          2.2 "qqq" выходит из программы
 *          2.3 "add" начинает __РУТИНУ__
 * 
 * 3.   __РУТИНА__(core)
 *      3.1 пока всё плохо: опрашиваем пользователя
 *              всё плохо = {в имени/фамилии цифры} или {в телефоне буквы}
 *      3.2 отдаём её в json_editor
 * 
 * 4.   делаем из строки json
 *
 * 5.   отдаём json в zip-editor
 */

public class core {

   public static void main(String[] args) {
        core a = new core();
        String validString = core.repl();
   }

   public static String repl(){
        Scanner localScanner = new Scanner(System.in);
        String temp = new String();
        String[] subStrings = new String[4];
        
        while (true){
            try {
                temp = localScanner.nextLine();
                subStrings = temp.split(" ");
                if (subStrings.length != 4){
                    throw new InputStructureException("через пробел <Ф> <И> <О> <телефон>"); 
                }
                if (subStrings[0].contains(subSequence(0,65)) {
                    
                }))
                return temp;
            }
            catch (Exception e){
                System.out.println(e.getLocalizedMessage());
            }
            
        }
        
        }
