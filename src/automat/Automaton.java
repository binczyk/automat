package automat;

import utils.Consol;
import zad1.State01;
import zad1.StateFactory1Impl;
import zad1.StateMapping1;
import zad2.State02;
import zad2.StateFactory2Impl;
import zad2.StateMapping2;

public class Automaton {

    public static void main(String[] args) {
        String word = Consol.getWord();
        tryToTestWord(new StateFactory1Impl(new StateMapping1()), new State01(), word);
        word = Consol.getWord();
        tryToTestWord(new StateFactory2Impl(new StateMapping2()), new State02(), word);

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
