package zad1;

import automat.State;

class State61 extends State {

    public State61() {
        this.name = "S6";
        this.endState = true;
        this.nextStates.put(Letters1.C, "S3");
    }
}
