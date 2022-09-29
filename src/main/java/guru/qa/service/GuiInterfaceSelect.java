package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import javax.swing.*;

public class GuiInterfaceSelect {

    private final CarStore carStore;
    private final TrackStore trackStore;


    public GuiInterfaceSelect(CarStore carStore, TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car chooseCar() {
        //String desiredCar = JOptionPane.showInputDialog("Car:");
        String[] car = {"Ferrari", "Mercedes"};
        ImageIcon iconCar = new ImageIcon("src/main/java/guru/qa/icon/car.png");
        String desiredCar = (String) JOptionPane.showInputDialog(
                null,
                "Choose a car:",
                "Car selection",
                JOptionPane.OK_OPTION,
                iconCar,
                car,
                car[0]);

        return carStore.lookup(desiredCar);
    }

    public Track chooseTrack() {
        // String desiredTrack = JOptionPane.showInputDialog("Track:");
        String[] track = {"Spa", "Nurburgring"};
        ImageIcon iconTrack = new ImageIcon("src/main/java/guru/qa/icon/track.png");
        String desiredTrack = (String) JOptionPane.showInputDialog(null,
                "Select track:",
                "Track selection",
                JOptionPane.OK_OPTION,
                iconTrack,
                track,
                track[0]);
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(Car car, Track track) {
        ImageIcon iconFuel = new ImageIcon("src/main/java/guru/qa/icon/gas-pump.png");
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Result:",
                    1,
                    iconFuel);


        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed ",
                    "Result:",
                    1,
                    iconFuel);
        }
    }

}
