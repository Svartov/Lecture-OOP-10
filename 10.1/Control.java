package Task;

import java.util.*;
import java.io.*;

public class Control {

    private Map<String, String> vocabulary = new HashMap<>();
    private String translate;

    public Control(Map<String, String> vocabulary, String translate) {
        this.vocabulary = vocabulary;
        this.translate = translate;
    }

    public Control(){
        super();
    }

    public Map<String, String> setVocabulary(String key, String value){
        vocabulary.put(key,value);
        return vocabulary;
    }

    public Map<String, String> getVocabulary(){
        vocabulary.put("Java", "Java");
        vocabulary.put("is", "це");
        vocabulary.put("strongly", "строго");
        vocabulary.put("typed", "типізована");
        vocabulary.put("object-oriented", "об’єктно-орієнтована");
        vocabulary.put("programming", "програмування");
        vocabulary.put("language", "мова");
        System.out.println(vocabulary);
        return vocabulary;
    }

    public String getTextFromFile(File file){
        String textEn = " ";
        try (Scanner sc = new Scanner(file)){
            for(; sc.hasNextLine() ;){
                textEn += sc.nextLine();
            }
            sc.hasNextLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return textEn;
    }

    public void setTextToFile(String text){
        File file = new File("Ukrainian.out.txt");
        try (PrintWriter pw = new PrintWriter(file)){
            pw.print(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getTranslate(File file){
        String[] textEn = getTextFromFile(file).split(" ");
        getVocabulary();
        translate = "";
        for(String word : textEn){
            if(vocabulary.containsKey(word)){
                translate += vocabulary.get(word) + " ";
            }else{
                translate += "";
            }
        }
        return translate;
    }

}
