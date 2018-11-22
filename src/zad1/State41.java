package zad1;

import automat.State;

class State41 extends State {

    public State41() {
        this.name = "S4";
        this.endState = true;
        this.nextStates.put(Letters1.A, "S1");
    }
}
