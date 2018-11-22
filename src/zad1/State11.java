package zad1;

import automat.State;

class State11 extends State {

    public State11() {
        this.name = "S1";
        this.nextStates.put(Letters1.B, "S4");
        this.nextStates.put(Letters1.C, "S4");
    }


}
