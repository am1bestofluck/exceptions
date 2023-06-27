package dz1;

import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.NoSuchElementException;

import dz1.t1;
import dz1.t2;

class exceptions1{
    
    static Scanner main_input = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true){
            System.out.println("Выбираем задание, 1 2 или 3");
            String task = main_input.next();
            switch (task) {
                case "1":
                    try{
                        // первое задание, получаем три исключения - не тот ввод(имя файла); не тот контент( в файле не числа); юзер передумал (ctrl+c)
                        System.out.println(String.format("Succes! Summ of numbers in file = %d", t1._t1()));
                        }
                    catch (IllegalArgumentException | FileNotFoundException | NoSuchElementException  e)
                        {
                            System.out.println(e.getLocalizedMessage());
                        }
                        
                        break;
                    case "2":
                        System.out.println("t2");
                        try {
                            Integer[] a = dz1.t2.declareArray();
                            Integer[] b =  dz1.t2.declareArray();
                            Integer[] c = dz1.t2._t2(a,b);
                            
                        for (int i = 0; i < c.length; i++) {
                            System.out.printf(c[i] + " ");
                        }
                        System.out.println();
                        }
                        catch (UnsupportedOperationException e){
                            System.out.println(e.getLocalizedMessage());
                        }
                        break;
                    case "3":
                        try{
                            Integer[] a = dz1.t2.declareArray();
                            Integer[] b =  dz1.t2.declareArray();
                            String[] c = dz1.t3._t3(a, b);
                            for (int i = 0; i < c.length; i++) 
                            {
                                System.out.printf(c[i] + " ");
                            }
                            System.out.println();
                        }
                        catch (UnsupportedOperationException | ArithmeticException e)
                        {
                            System.out.println(e.getLocalizedMessage());
                        };
                        break;
                default:
                    System.out.println("Спасибо за внимание :)");
                    System.exit(0);
                    break;
                
            }
            
        

             
}}
    
    

    

    private static void t3(){
        System.out.println("t3");

    }
}