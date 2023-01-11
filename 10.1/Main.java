package Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("English.is.txt");


        try(PrintWriter pw = new PrintWriter(file)){
            pw.print("Java is strongly typed object-oriented programming language" + " " + "Java is ok");
        }catch (IOException e){
            e.printStackTrace();
        }

        Control control = new Control();
        System.out.println(control.getTranslate(file));
        control.setVocabulary("ok", "добре");
        control.setTextToFile(control.getTranslate(file));
        System.out.println(control.getTranslate(file));
    }

}