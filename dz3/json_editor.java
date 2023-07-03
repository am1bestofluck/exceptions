package dz3;

import java.nio.file.Path;
import java.util.HashMap;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;

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

    public void roll() {
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

    private void appendFile(File arg) {
        JSONObject new_content = new JSONObject(new HashMap<String, String>());
        new_content.put("name", this.items[0]);
        new_content.put("lastName", this.items[1]);
        new_content.put("byFather", this.items[2]);
        new_content.put("byFather", this.items[3]);
    }
}