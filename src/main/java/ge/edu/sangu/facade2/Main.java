package ge.edu.sangu.facade2;

public class Main {

    public static void main(String[] args) {

        CarEngineFacade carEngineFacade = new CarEngineFacade();

        System.out.println("Starting car engine\n");
        carEngineFacade.startEngine();

        System.out.println("\n\n\n");

        System.out.println("Stopping car engine\n");
        carEngineFacade.stopEngine();
    }

}
