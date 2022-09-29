package guru.qa;

import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

public class Main {
    public static void main(String[] args) {
        new guru.qa.Application(new guru.qa.service.GuiInterfaceSelect(
                new CarStore(),
                new TrackStore()
        )).run();
    }
}
