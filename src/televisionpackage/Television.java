package televisionpackage;

public class Television {

    private final Volume volume = new Volume();
    private boolean stateOfTelevision;
    private Channel channelNumber;

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
        if(checkStateOfTelevision())volume.increaseVolume();
    }


    public Volume getStateOfVolume() {
        if(checkStateOfTelevision())return volume;
        return null;
    }

    public void decreaseVolume() {
        if(checkStateOfTelevision())volume.decreaseVolume();
    }



    public Channel getStateOfChannel() {
        if(checkStateOfTelevision())return channelNumber;
        return null;
    }
}
