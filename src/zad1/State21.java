package zad1;

import automat.State;

class State21 extends State {

    public State21() {
        this.name = "S2";
        this.nextStates.put(Letters1.A, "S5");
        this.nextStates.put(Letters1.C, "S5");
    }
}
