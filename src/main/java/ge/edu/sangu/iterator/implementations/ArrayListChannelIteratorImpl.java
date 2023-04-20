package ge.edu.sangu.iterator.implementations;

import ge.edu.sangu.iterator.channel.Channel;
import ge.edu.sangu.iterator.channel.ChannelType;
import ge.edu.sangu.iterator.interfaces.ChannelIterator;

import java.util.List;

public class ArrayListChannelIteratorImpl implements ChannelIterator {

    private ChannelType channelType;
    private List<Channel> channels;
    private int position;

    public ArrayListChannelIteratorImpl(ChannelType channelType, List<Channel> channels) {
        this.channelType = channelType;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel channel = channels.get(position);
            if (channel.getChannelType().equals(channelType) || channelType.equals(ChannelType.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel channel = channels.get(position);
        position++;
        return channel;
    }
}
