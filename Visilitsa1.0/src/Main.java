import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start new game (S) \nExit game      (E)");

        while (true) {
            if(scanner.nextLine().equals("S")) {

                String hiddenWord = HiddenWord.getRandEl(HiddenWord.getListWords("words"));

                String newMask = Mask.getMaskWord(hiddenWord);

                char[] hiddenWordChar = hiddenWord.toCharArray();

                System.out.println(Mask.getMaskWord(hiddenWord));

                List<String> masks = new ArrayList<>();

                char[] mainMask = new char[hiddenWord.length()];

                for (int i = 0; i < hiddenWord.length(); i++) {
                    mainMask[i] = '*';
                }

                while (true) {
                    System.out.println("Enter your letter :");

                    String input = scanner.nextLine();

                    newMask = Mask.guessRightNotLetter(input, HiddenWord.getListWordsLetters(hiddenWord), hiddenWord);

                    masks.add(newMask);

                    for (int i = 0; i < masks.size(); i++) {
                        for (int j = 0; j < masks.get(i).length(); j++) {
                            if (masks.get(i).charAt(j) != '*') {
                               mainMask[j] = masks.get(i).charAt(j);
                            }
                        }
                    }

                    if (Mask.position != 7) {
                        System.out.println(mainMask);
                    }
//                    System.out.println(hiddenWord);

                    if (Mask.position == 7) {
                        System.out.println("Start new game (S) \nExit game      (E)");

                        Mask.setPosition(0);

                        break;
                    }

                    if(Arrays.equals(mainMask, hiddenWordChar)) {
                        System.out.println("Victory!!!" + "\n");
                        System.out.println("Start new game (S) \nExit game      (E)");

                        break;
                    }

                }

            } else if (scanner.nextLine().equals("E")) {
                break;
            }

        }

    }

}
