public class Action {
    private State stateA;
    private State stateB;
    private int cost;

    public Action(State stateA, State stateB, int cost) {
        this.stateA = stateA;
        this.stateB = stateB;
        this.cost = cost;
    }

    public State getStateA() {
        return stateA;
    }

    public void setStateA(State stateA) {
        this.stateA = stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public void setStateB(State stateB) {
        this.stateB = stateB;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
