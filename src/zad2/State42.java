package zad2;

import automat.State;

public class State42 extends State {

    public State42() {
        this.name = "S4";
        this.nextStates.put(Letters2.A, "S5");
        this.nextStates.put(Letters2.B, "S3");

    }
}
