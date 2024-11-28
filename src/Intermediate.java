public class Intermediate extends Advance {
    private Lexicon lexicon;
    private Levels levels;
    private String grammar;

    public Levels getLevels() {
        return levels;
    }

    public Lexicon getLexicon() {
        return lexicon;
    }

    public String getGrammar() {
        return grammar;
    }

    public Intermediate(String name, Lexicon lexicon, Levels levels, String grammar) {
        super(name);
        this.lexicon = lexicon;
        this.grammar = grammar;
        this.levels = levels;
    }

    public void getInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Lexicon: " + lexicon.getLexicon());
        System.out.println("Level: " + levels);
        System.out.println("Grammar: " + grammar);
    }

    public void lexiconLevel () {
        System.out.println("Lexicon: " + lexicon.getLexicon() + " words");
    }
    public final void getInfo (String level) {
        System.out.println("Level " + levels +  level);
    }
}
