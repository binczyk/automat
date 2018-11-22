package zad2;

import automat.State;

public class State02 extends State {

    public State02() {
        this.name = "S0";
        this.nextStates.put(Letters2.A, "S2");
        this.nextStates.put(Letters2.B, "S1");
    }
}
