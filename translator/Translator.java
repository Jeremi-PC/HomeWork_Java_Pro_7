package translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Создайте программу-переводчик с английского языка.
// Пользователь вводит слово на английском языке, переводчик показывает перевод.
// Если переводчик не обнаружил в словаре введённое слово,
// то он просит пользователя ввести перевод,
// после чего сохраняет слово и его перевод в словарь.
// Программа продолжается, пока пользователь не введёт stopTranslate.
public class Translator {
    public static String engWord;
    public static String rusWord;

    public Translator() {

    }

    public void addWord(String engWord, String rusWord, Map<String, String> map) {
        map.put(engWord, rusWord);
    }

    public void getRusWord(String engWord, Map<String, String> map) {
        String rusWord = map.get(engWord);
        System.out.println("Перевод: " + rusWord);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Translator translator = new Translator();
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple", "яблоко");
        dictionary.put("boat", "лодка");
        dictionary.put("circle", "круг");
        dictionary.put("device", "устройство");
        dictionary.put("eagle", "орел");

        while (true) {
            System.out.println("Pls input english word for translate:");
            String engWord = sc.next().toLowerCase();
            if (engWord.equals("stoptranslate")) {
                break;
            }
            if (dictionary.containsKey(engWord)) {
                translator.getRusWord(engWord, dictionary);
            } else {
                System.out.print("Нет такого слова, добавьте перевод: ");
                String rusWord = sc.next().toLowerCase();
                translator.addWord(engWord, rusWord, dictionary);
            }
        }
    }
}
