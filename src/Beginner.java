public final class Beginner extends Intermediate {

    public Beginner(String name, Lexicon lexicon, Levels levels, String grammar) {
        super(name, lexicon, levels, grammar);
    }

    @Override
    public void lexiconLevel() {
        super.lexiconLevel();
        System.out.println("is " + Levels.A1_A2 + "level");
    }
}
