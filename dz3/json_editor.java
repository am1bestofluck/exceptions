package dz3;

import java.nio.file.Path;
import java.io.File;
import java.io.IOException;
/**
 * json_editor
 */
public class json_editor {
    String[] items;
    public json_editor(String[] args){
        this.items =args; 
    }
    public static void main(String[] args) {
        // принимаем массив строк;
        String filename = args[0];
        System.out.println();
        // если файл есть:
            // читаем что есть в файле;
        // если файла нет:
            // создаём пустой??
        // дописываем;
    }
    public void roll(){
        String filename = this.items[0];
        String relativePath = "./dz3/"+filename+".json";
        if (!Path.of(relativePath).toFile().exists())
            {
                File newFile = new File(relativePath);
                try
                {
                    newFile.createNewFile();
                }
                catch (IOException e){}
            }

        System.out.println();
    }
    private boolean fileCreator (String filename){
        return true;
    }
    private String fileReader(String fileName){
        String out = new String();
        return out;
    }

    private void fileWriter(String arg){

    }
}