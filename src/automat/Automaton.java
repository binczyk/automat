package automat;

import utils.Consol;
import zad1.State01;
import zad1.StateFactory1Impl;
import zad2.State02;
import zad2.StateFactory2Impl;

public class Automaton {

    public static void main(String[] args) {
        String word = Consol.getWord();
        tryToTestWord(new StateFactory1Impl(), new State01(), word);
        word = Consol.getWord();
        tryToTestWord(new StateFactory2Impl(), new State02(), word);

    }

    private static void tryToTestWord(StateFactory factory, State state0, String word) {
        State state = state0;
        StateFactory stateFactory = factory;
        try {
            for (int i = 0; i < word.length(); i++) {
                state = stateFactory.getState(state, word.charAt(i));
            }
            Consol.printResult(state, word);
        } catch (LetterDoesNotExistException e) {
            Consol.print(e.getMessage());
        }
    }
}
