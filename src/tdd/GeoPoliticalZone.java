package tdd;

public enum GeoPoliticalZone {
    SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross river","Delta", "Edo", "Rivers"),
    NORTHCENTRAL("Benue","FCT","Kogi","kwara","Nasarawa","Niger","plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private final String[] states;

    GeoPoliticalZone(String ...state){
        this.states = state;
    }
    public String[] getState(){
        return states;
    }
}

