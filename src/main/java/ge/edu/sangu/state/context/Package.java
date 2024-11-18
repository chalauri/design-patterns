package ge.edu.sangu.state.context;

import ge.edu.sangu.state.states.OrderedState;
import ge.edu.sangu.state.states.PackageState;

public class Package {

    private PackageState state = new OrderedState();

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
