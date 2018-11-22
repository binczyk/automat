package zad2;

import automat.State;

public class State52 extends State {

    public State52() {
        this.name = "S5";
        this.nextStates.put(Letters2.A, "S1");
        this.nextStates.put(Letters2.B, "S6");

    }
}
