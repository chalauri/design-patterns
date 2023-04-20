package ge.edu.sangu.iterator.implementations;

import ge.edu.sangu.iterator.channel.Channel;
import ge.edu.sangu.iterator.channel.ChannelType;
import ge.edu.sangu.iterator.interfaces.ChannelCollection;
import ge.edu.sangu.iterator.interfaces.ChannelIterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionListImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionListImpl() {
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelsList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        this.channelsList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType channelType) {
        return new ListChannelIteratorImpl(channelType, channelsList);
    }
}
