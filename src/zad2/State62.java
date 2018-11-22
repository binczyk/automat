package zad2;

import automat.State;

public class State62 extends State {

    public State62() {
        this.name = "S6";
        this.nextStates.put(Letters2.A, "S5");
        this.nextStates.put(Letters2.B, "S7");

    }
}
