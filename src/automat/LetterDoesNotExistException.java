package automat;

public class LetterDoesNotExistException extends Exception {

    public LetterDoesNotExistException(char letter) {
        super("Letter " + letter + " does not exit in dictionary");
    }
}
