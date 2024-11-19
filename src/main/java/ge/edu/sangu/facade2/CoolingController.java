package ge.edu.sangu.facade2;

public class CoolingController {
    public void setTemperatureUpperLimit(int defaultCoolingTemp) {
        System.out.println("Setting default cooling temp to " + defaultCoolingTemp);
    }

    public void run() {
        System.out.println("Cooling controller is running");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Setting max allowed temp to " + maxAllowedTemp);
    }

    public void stop() {
        System.out.println("Stopping Cooling Controller");
    }
}
