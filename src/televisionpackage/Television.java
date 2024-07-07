package televisionpackage;

public class Television {

    private Volume volume = new Volume();
    private boolean stateOfTelevision;

    public boolean checkStateOfTelevision() {
        return stateOfTelevision;
    }

    public void turnOff() {
        stateOfTelevision = false;
    }

    public void turnOn() {
        stateOfTelevision = true;
    }

    public void increaseVolume() {
        volume.increaseVolume();
    }

    public void increaseVolume(int number) {
        volume.increaseVolume(number);
    }

    public Volume getStateOfVolume() {
        return volume;
    }

    public void decreaseVolume() {
        volume.decreaseVolume();
    }

    public void decreaseVolume(int number) {
        volume.decreaseVolume(number);
    }
}
