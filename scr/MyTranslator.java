import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyTranslator {
    HashMap<String, String> translator = new HashMap<>();

    public MyTranslator(HashMap<String, String> translator) {
        this.translator = translator;
    }

    public static void main(String[] args) {
        HashMap<String, String> translator = new HashMap<>();
        MyTranslator mytranslator = new MyTranslator(translator);
        Scanner sc = new Scanner(System.in);
        mytranslator.addWord("one", "один");
        mytranslator.addWord("tree", "дерево");
        mytranslator.addWord("sun", "солнце");
        mytranslator.addWord("cloud", "облако");
        mytranslator.addWord("day", "день");
        mytranslator.addWord("spoon", "ложка");
        mytranslator.addWord("green", "зеленный");
        mytranslator.addWord("red", "красный");
        mytranslator.addWord("south", "юг");
        System.out.println("Enter phrase");
        String phrase = sc.nextLine();
        String delimeter = " ";
        String[] subStr = phrase.split(delimeter);

        for (int i = 0; i < subStr.length; i++) {

            System.out.print(mytranslator.translate(subStr[i]) + " ");
        }
    }

    public void addWord(String word, String transla) {
        translator.put(word, transla);

    }

    public String translate(String word) {
        return translator.get(word);

    }
}
