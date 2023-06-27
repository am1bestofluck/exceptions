package dz1;

import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

import dz1.t1;

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
                            Integer[] a = t2.declareArray();
                            Integer[] b =  t2.declareArray();
                            Integer[] c = t2._t2(a,b);
                            
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
                        System.out.println("t3");
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