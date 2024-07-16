package televisionpackage;

public class Channel {
    public Channel(){
        this.channel = 1;
    }

    @Override
    public boolean equals(Object obj) {
        Channel channel = (Channel) obj;
        return channel.channel == this.channel;
    }


    private final int channel;
}
