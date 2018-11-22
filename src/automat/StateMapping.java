package automat;

import java.util.HashMap;
import java.util.Map;

public abstract class StateMapping {

    protected Map<String, State> stateMap = new HashMap<>();

    public Map<String, State> getStateMap() {
        return stateMap;
    }

}
