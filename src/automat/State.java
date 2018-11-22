package automat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class State {
    protected String name;
    protected Map<Enum, String> nextStates = new HashMap<>();
    protected boolean endState = false;

    public boolean isEndState() {
        return endState;
    }

    public Map<Enum, String> getNextStates() {
        return nextStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        State state = (State) o;
        return endState == state.endState && Objects.equals(name, state.name) &&
               Objects.equals(nextStates, state.nextStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nextStates, endState);
    }
}
