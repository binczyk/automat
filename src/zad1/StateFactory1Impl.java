package zad1;

import automat.LetterDoesNotExistException;
import automat.State;
import automat.StateFactory;
import automat.StateMapping;

public class StateFactory1Impl implements StateFactory {

    private StateMapping mapping = new StateMapping1();

    @Override
    public State getState(State state, char newLetter) throws LetterDoesNotExistException {
        Letters1 letter = Letters1.getLetter(newLetter);
        if (state.getNextStates().containsKey(letter)) {
            String nextStateName = state.getNextStates().get(letter);
            return mapping.getStateMap().get(nextStateName);
        }
        return state;
    }
}
