public class Words {


    private String[] randomWords = {"match", "harass", "longing", "respect", "wealthy", "allow", "square", "march", "aware", "lopsided",
            "shocking", "naughty", "language", "show", "preach", "famous", "load", "cause", "delight", "careful", "parsimonious",
            "rock", "moon", "racial", "temper", "magenta", "health", "glistening", "oranges", "giddy", "obsolete", "young", "zip",
            "tenuous", "haunt", "horse", "blood", "murder", "history", "peck", "medical", "embarrassed", "ritzy", "sock", "argument",
            "snake", "inconclusive", "month", "vivacious", "engine", "zephyr", "inexpensive", "pour", "enchanted", "wood", "grin",
            "ticket", "rose", "voiceless", "daughter", "promise", "cap", "beam", "actor", "sigh", "regret", "mice", "start",
            "evanescent", "smash", "travel", "mundane", "thick", "toothbrush", "relieved", "sun", "seat", "bustling", "guarantee",
            "cultured", "yummy", "heat", "cent", "female", "apparatus", "second", "tawdry", "heavy", "person", "field", "story",
            "zoom", "experience", "car", "realize", "overjoyed", "amused", "noiseless", "squalid", "happen"};

    private String [] randomCountry = {"croatia", "portugal","slovakia","czechia","france","spain","italy","china","ukraine",
            "england","scotland","norway","finland","sweden","turkey"};

    private String [] animals = {"dog","cat","cow","dolphin","platypus","lion","tiger","bear","monkey","shark","kangaroo",
            "mouse","pigeon","moose"};

    private String randomGeneratedWord;

    public String getRandomGeneratedWord() {
        return randomGeneratedWord;
    }

    public void setRandomGeneratedWord(String randomGeneratedWord) {
        this.randomGeneratedWord = randomGeneratedWord;
    }

    public String pickAWord (String userChoice){
        boolean checkLogic = true;

        do {
            switch (userChoice){

                case "1":

                    String generateWord = randomWords[(int) (Math.random() * (randomWords.length))];
                    setRandomGeneratedWord(generateWord);
                    checkLogic = false;
                    break;

                case "2":

                    String generateWordCountry = randomCountry[(int) (Math.random() * (randomCountry.length))];
                    setRandomGeneratedWord(generateWordCountry);
                    checkLogic = false;
                    break;

                case "3":

                    String generateWordAnimal = animals[(int) (Math.random() * (animals.length))];
                    setRandomGeneratedWord(generateWordAnimal);
                    checkLogic = false;
                    break;
            }
        } while (checkLogic);
        return getRandomGeneratedWord();
    }

}
