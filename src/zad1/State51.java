package zad1;

import automat.State;

class State51 extends State {

    public State51() {
        this.name = "S5";
        this.endState = true;
        this.nextStates.put(Letters1.B, "S2");
    }
}
