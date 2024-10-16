import java.util.Stack;

public class SentenceBuilder {

    /**
     * Constructor.
     */
    private Stack<String> nextSentence;

    public SentenceBuilder() {
        nextSentence = new Stack<>();
    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        nextSentence.add(word);

    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (!nextSentence.isEmpty()) {
           return  nextSentence.pop();
        }
        return null;
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
        return nextSentence.toString();
    }
}
