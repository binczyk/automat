package zad1;

import automat.LetterDoesNotExistException;

public enum Letters1 {
    A('a'),
    B('b'),
    C('c');

    char letter;

    Letters1(char letter) {
        this.letter = letter;
    }

    public static Letters1 getLetter(char letter) throws LetterDoesNotExistException {
        for (Letters1 l : Letters1.values()) {
            if (l.letter == letter) {
                return l;
            }
        }
        throw new LetterDoesNotExistException(letter);
    }
}
