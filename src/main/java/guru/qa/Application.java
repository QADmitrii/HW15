package guru.qa;

import guru.qa.domain.Car;
import guru.qa.domain.Track;

public class Application {

    private final guru.qa.service.GuiInterfaceSelect userInterface;

    public Application(guru.qa.service.GuiInterfaceSelect userInterface) {
        this.userInterface = userInterface;
    }

    void run() {
        Car car = userInterface.chooseCar();
        Track track = userInterface.chooseTrack();
        userInterface.showResult(car, track);
    }
}
