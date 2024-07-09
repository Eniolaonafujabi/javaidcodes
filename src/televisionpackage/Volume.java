package televisionpackage;

public class Volume {
    private int volume;
    public Volume(int volume) {
        this.volume = volume;
    }

    public Volume() {
        this.volume = 0;
    }

    public void increaseVolume() {
        if (volume >= 100) {
        }else {this.volume++;}
    }

    public void increaseVolume(int number) {
        if (volume == 100) {
        }else{this.volume+=number;}
    }

    @Override
    public boolean equals(Object obj) {
        Volume v = (Volume) obj;
        return this.volume == v.volume;
    }

    public void decreaseVolume() {
        if(volume==0){
        }else {this.volume--;}
    }

    public void decreaseVolume(int number) {
        if(volume==0){}else {this.volume-=number;}
    }

}
