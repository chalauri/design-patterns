package ge.edu.sangu.iterator.channel;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@EqualsAndHashCode
public class Channel {
    private double frequency;
    private ChannelType channelType;

    public Channel(double frequency, ChannelType channelType) {
        this.frequency = frequency;
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return "Channel{"
                + "frequency="
                + frequency
                + ", channelType="
                + channelType
                + '}';
    }
}
