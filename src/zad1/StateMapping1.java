package zad1;

import automat.StateMapping;

class StateMapping1 extends StateMapping {

    public StateMapping1() {
        this.stateMap.put("S0", new State01());
        this.stateMap.put("S1", new State11());
        this.stateMap.put("S2", new State21());
        this.stateMap.put("S3", new State31());
        this.stateMap.put("S4", new State41());
        this.stateMap.put("S5", new State51());
        this.stateMap.put("S6", new State61());
    }

}
