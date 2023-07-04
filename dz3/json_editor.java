package dz3;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

/**
 * json_editor
 */
public class json_editor {
    String[] items;

    public json_editor(String[] args) {
        this.items = args;
    }

    public static void main(String[] args) {
        // принимаем массив строк;
        // если файл есть:
        // читаем что есть в файле;
        // если файла нет:
        // создаём пустой??
        // дописываем;
    }

    public void roll() throws IOException {
        File chain = this.getFile();
        this.appendFile(chain);

    }

    public File getFile() {
        String filename = this.items[0];
        String relativePath = "./dz3/" + filename + ".json";
        File newFile = null;
        if (!Path.of(relativePath).toFile().exists()) {
            newFile = new File(relativePath);
            try {
                newFile.createNewFile();
            } catch (IOException e) {

            }

        } else {
            newFile = new File(relativePath);
        }

        return newFile;
    }

    private void appendFile(File arg) throws IOException {

        
        String old = new String();
        JSONObject old_content = null;
        
        try 
        {
            Scanner freader = new Scanner(arg);
            while (freader.hasNext())
            {
                old = old + freader.nextLine();
            }

        }
        catch ( FileNotFoundException e) {
            System.out.println("Раз уж у нас курс про обработку исключений"
            + " то нужно что-то тут написать. Но вообще исключения тут быть не должно...");
        }
        if (old.isEmpty() || old.isBlank()){
            old = "{}";
        }
        JSONParser parser = new JSONParser();
        Integer max_index = 0;
        try{
            Object temp = parser.parse(old);
            old_content = (JSONObject) temp;
            max_index =0;
            System.out.println();
            while (old_content.keySet().contains(String.valueOf(max_index))) {
                max_index ++ ;
            }
        }
        catch (ParseException e){
            throw new IOException("Aborting. Old file data is invalid.");
            
        }
        HashMap<String, String>  tmp = new HashMap<String,String>();
        tmp.put("LastName", this.items[0]);
        tmp.put("FirstName", this.items[1]);
        tmp.put("byFather", this.items[2]);
        tmp.put("phone", this.items[3]);
        JSONObject new_content = new JSONObject(new HashMap<Integer, HashMap<String,String>>());
        new_content.put(String.valueOf(max_index), tmp);
        try
        {old_content.putAll(new_content);}
        catch (NullPointerException e) {
            System.out.println("null pointer exception?");
        }
        try
        {
            FileWriter tempFileWriter = new FileWriter(arg);
            tempFileWriter.write(old_content.toJSONString());
            tempFileWriter.close();
        }
        catch (IOException e) {
            System.out.println("error while writing new content");
        } 
        System.out.println("Complete!");
    }
}