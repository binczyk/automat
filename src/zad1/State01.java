package zad1;

import automat.State;

public class State01 extends State {

    public State01() {
        this.name = "S0";
        this.endState = true;
        this.nextStates.put(Letters1.A, "S1");
        this.nextStates.put(Letters1.B, "S2");
        this.nextStates.put(Letters1.C, "S3");
    }
}
