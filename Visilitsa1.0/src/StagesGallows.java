public class StagesGallows {

    private final int stage;

    public StagesGallows(int stage) {
        this.stage = stage;
    }

    public void printInfoStateGallows(String hiddenWord) {
        switch (this.stage) {
            case 0 -> System.out.println("""
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    * * * * * * * * * * *
                    """);
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

    }

    public int getStage () {
        return stage;
    }

}
