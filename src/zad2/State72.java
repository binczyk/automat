package zad2;

import automat.State;

public class State72 extends State {

    public State72() {
        this.name = "S7";
        this.endState = true;
        this.nextStates.put(Letters2.A, "S1");
        this.nextStates.put(Letters2.B, "S1");

    }
}
