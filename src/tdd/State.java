package tdd;

import java.util.Arrays;

public class State {

    public GeoPoliticalZone checkZone(String state){
        for(GeoPoliticalZone z : GeoPoliticalZone.values()){
            if(z.toString().equalsIgnoreCase(state)){
                return GeoPoliticalZone.valueOf(z.name());
            }
        }
        return null;
    }

    public static void main(String[] args) {
        State s = new State();
        GeoPoliticalZone z1 = s.checkZone("Lagos");
        System.out.println(z1);
    }
}
