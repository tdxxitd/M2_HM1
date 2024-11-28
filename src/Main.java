public class Main {
    public static void main(String[] args) {
        Intermediate objectA = new Intermediate("Alex",new Lexicon(1600), Levels.B1_B2, "is good");
        Beginner objectB = new Beginner("Dani", new Lexicon(650), Levels.A1_A2, "is so so");
        Beginner objectC = new Beginner("Jake", new Lexicon(720), Levels.A1_A2, "is bad");


        objectA.getInfo();
        objectA.lexiconLevel();
        objectA.getInfo("is very good");


        objectB.getInfo();
        objectB.lexiconLevel();
        objectB.getInfo("is not bad");


        objectC.getInfo();
        objectC.lexiconLevel();
        objectC.getInfo("is so so");
    }
}