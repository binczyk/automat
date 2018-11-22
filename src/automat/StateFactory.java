package automat;

public interface StateFactory {

    State getState(State state, char letter) throws LetterDoesNotExistException;
}
