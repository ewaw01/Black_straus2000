import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mask {

    static int position;

    public Mask() {

    }

    public static String getMaskWord(String word) {
        String mask = "";

        for (int i = 0; i < word.length(); i++) {
            mask += "*";
        }

        return mask;
    }

    public static String guessRightNotLetter(String letter, String[] listWordsLetters, String hiddenWord) {
        List<Integer> ids = new ArrayList<>();
        String[] maskArray = new String[hiddenWord.length()];

        String newMask = "";

        for (int i = 0; i < hiddenWord.length(); i++) {
            maskArray[i] = "*";
        }

        if(hiddenWord.contains(letter)) {
            for (int i = 0; i < listWordsLetters.length; i++) {
                if (listWordsLetters[i].equals(letter)) {
                    ids.add(i);
                }
            }

            for (int el : ids) {
                maskArray[el] = letter;
            }

            for (int i = 0; i < maskArray.length; i++) {
                newMask += maskArray[i];
            }

            StagesGallows stagesGallows = new StagesGallows(position);
            stagesGallows.printInfoStateGallows(hiddenWord);

            return newMask;
        } else {
            position += 1;

            StagesGallows stagesGallows = new StagesGallows(position);
            stagesGallows.printInfoStateGallows(hiddenWord);

            return getMaskWord(hiddenWord);
        }

    }

    public static void setPosition(int position) {
        Mask.position = position;
    }

}
