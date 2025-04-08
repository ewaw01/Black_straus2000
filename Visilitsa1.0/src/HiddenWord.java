import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HiddenWord {

    public HiddenWord() {

    }

    public static List<String> getListWords(String nameFile) throws FileNotFoundException {
        File fileWords = new File(nameFile);
        Scanner scannerW = new Scanner(fileWords);

        List<String> listWords = new ArrayList<>();

        while (true) {
            try {
                listWords.add(scannerW.nextLine());
            } catch (Exception e) {
                break;
            }
        }

        scannerW.close();

        return listWords;
    }

    public static String getRandEl(List<String> list) {
        Random r = new Random();

        int idRandElement = r.nextInt(list.size() - 1);
        String element = list.get(idRandElement);

        return element;
    }

    public static String[] getListWordsLetters(String word) {
        String[] ListWordsLetters = word.split("");

        return ListWordsLetters;
    }

}
