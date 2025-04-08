import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        File fileW = new File("words");
        Scanner scanner1 = new Scanner(fileW);

        List<String> words = new ArrayList<>();

        while (true) {
            try {
                words.add(scanner1.nextLine());
            } catch (Exception e) {
                break;
            }
        }

        scanner1.close();

        String hidden = "";

//        System.out.println(words);

        startOrExit();

        while (true) {
            hidden = "";

            if (scanner.nextLine().equals("S")) {
                Random r = new Random();
                int idRandWord = r.nextInt(words.size() - 1);
                String hiddenWord = words.get(idRandWord);

                for (int i = 0; i < hiddenWord.length(); i++) {
                    hidden += "*";
                }

                String[] hiddenArray = new String[hidden.length()];

                for (int i = 0; i < hidden.length(); i++) {
                    hiddenArray[i] = "*";
                }

                System.out.println("\n" + hidden + "\n");
//                System.out.println(hiddenWord);

                System.out.println("""
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        * * * * * * * * * * *
                        """);
                int position = 0;

//                        * * * * * * * * * * *
//                        * _ _ _ _ _ _ _ _ _ *
//                        * | * * * | * * * | *  7 positions
//                        * | * * * | * * * | *
//                        * | * * * @ * * * | *
//                        * | * * / O \ * * | *
//                        * | * * * П * * * | *
//                        * | * * * * * * * | *

                while (true) {
                    int exit = 0;

                    String input = scanner.nextLine().toLowerCase();
                    String newHidden = "";

                    if (hiddenWord.contains(input)) {

                        String[] q = hiddenWord.split("");

                        List<Integer> ids = new ArrayList<>();

                        for (int i = 0; i < q.length; i++) {
                            if (q[i].equals(input)) {
                                ids.add(i);
                            }
                        }

                        for (int el: ids) {
                            hiddenArray[el] = input;
                        }

                        newHidden = "";

                        for (int i = 0; i < hiddenArray.length; i++) {
                            newHidden += hiddenArray[i];
                        }

                        System.out.println(newHidden);

                        if (newHidden.equals(hiddenWord)) {
                            System.out.println("Victory!!!");
                            break;
                        }

                    } else {
                        position += 1;
                        switch (position) {
                            case 1 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    """);
                            case 2 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    * | * * * * * * * * *
                                    """);
                            case 3 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    """);
                            case 4 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * | * * * | *
                                    * | * * * | * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    """);
                            case 5 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * | * * * | *
                                    * | * * * | * * * | *
                                    * | * * * @ * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    """);
                            case 6 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * | * * * | *
                                    * | * * * | * * * | *
                                    * | * * * @ * * * | *
                                    * | * * / O \\ * * | *
                                    * | * * * * * * * | *
                                    * | * * * * * * * | *
                                    """);
                            case 7 -> System.out.println("""
                                    * * * * * * * * * * *
                                    * _ _ _ _ _ _ _ _ _ *
                                    * | * * * | * * * | *
                                    * | * * * | * * * | *
                                    * | * * * @ * * * | *
                                    * | * * / O \\ * * | *
                                    * | * * * П * * * | *
                                    * | * * * * * * * | *
                                    You lose ;(
                                    """ + "The word is: " + hiddenWord + "\n");

                        }

                        if (position == 7) {
                            startOrExit();
                            break;
                        }
                    }
                }

            } else if (scanner.nextLine().equals("E")) {
                break;

            } else {
                System.out.println("Error. Try again : ");
            }
        }

    }

    public static void startOrExit() {
        System.out.println("Start new game (S) \nExit game      (E)");
    }

}
