package zad2;

import automat.State;

public class State22 extends State {

    public State22() {
        this.name = "S2";
        this.nextStates.put(Letters2.A, "S1");
        this.nextStates.put(Letters2.B, "S3");
    }
}
