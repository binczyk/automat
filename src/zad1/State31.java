package zad1;

import automat.State;

class State31 extends State {
    public State31() {
        this.name = "S3";
        this.nextStates.put(Letters1.A, "S6");
        this.nextStates.put(Letters1.B, "S6");
    }
}
