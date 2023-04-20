package ge.edu.sangu.iterator.channel;


import java.util.Objects;

public class Channel {
    private double frequency;
    private ChannelType channelType;

    public Channel(double frequency, ChannelType channelType) {
        this.frequency = frequency;
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", channelType=" + channelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return Double.compare(channel.frequency, frequency) == 0 && channelType == channel.channelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, channelType);
    }
}
