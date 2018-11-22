package zad2;

import automat.LetterDoesNotExistException;

enum Letters2 {
    A('a'),
    B('b');

    char letter;

    Letters2(char letter) {
        this.letter = letter;
    }

    public static Letters2 getLetter(char letter) throws LetterDoesNotExistException {
        for (Letters2 l : Letters2.values()) {
            if (l.letter == letter) {
                return l;
            }
        }
        throw new LetterDoesNotExistException(letter);
    }
    }
