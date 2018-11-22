package zad2;

import automat.LetterDoesNotExistException;
import automat.State;
import automat.StateFactory;
import automat.StateMapping;

public class StateFactory2Impl implements StateFactory {

    private StateMapping mapping = new StateMapping2();

    @Override
    public State getState(State state, char newLetter) throws LetterDoesNotExistException {
        Letters2 letter = Letters2.getLetter(newLetter);
        if (state.getNextStates().containsKey(letter)) {
            String nextStateName = state.getNextStates().get(letter);
            return mapping.getStateMap().get(nextStateName);
        }
        return state;
    }
}
