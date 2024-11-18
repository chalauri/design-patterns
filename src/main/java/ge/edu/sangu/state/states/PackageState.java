package ge.edu.sangu.state.states;

import ge.edu.sangu.state.context.Package;

public interface PackageState {

    void next(Package packageObject);

    void prev(Package packageObject);

    void printStatus();

}
