package zad2;

import automat.StateMapping;

public class StateMapping2 extends StateMapping {

    public StateMapping2() {
        this.stateMap.put("S0", new State02());
        this.stateMap.put("S1", new State12());
        this.stateMap.put("S2", new State22());
        this.stateMap.put("S3", new State32());
        this.stateMap.put("S4", new State42());
        this.stateMap.put("S5", new State52());
        this.stateMap.put("S6", new State62());
        this.stateMap.put("S7", new State72());
    }

}
