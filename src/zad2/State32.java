package zad2;

import automat.State;

public class State32 extends State {

    public State32() {
        this.name = "S3";
        this.nextStates.put(Letters2.A, "S4");
        this.nextStates.put(Letters2.B, "S1");

    }
}
