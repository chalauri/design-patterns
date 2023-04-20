package ge.edu.sangu.iterator.interfaces;

import ge.edu.sangu.iterator.channel.Channel;
import ge.edu.sangu.iterator.channel.ChannelType;

public interface ChannelCollection {
    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    ChannelIterator iterator(ChannelType channelType);
}
