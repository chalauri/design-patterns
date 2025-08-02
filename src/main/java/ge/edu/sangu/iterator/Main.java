package ge.edu.sangu.iterator;

import ge.edu.sangu.iterator.channel.Channel;
import ge.edu.sangu.iterator.channel.ChannelType;
import ge.edu.sangu.iterator.implementations.ChannelCollectionListImpl;
import ge.edu.sangu.iterator.interfaces.ChannelCollection;
import ge.edu.sangu.iterator.interfaces.ChannelIterator;

public class Main {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelType.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }


        System.out.println("******");

        System.out.println("After removing one of Georgian channels");
        // Print after removing channel
        ChannelIterator georgianIterator = channels.iterator(ChannelType.GEORGIAN);
        channels.removeChannel(new Channel(105.5, ChannelType.GEORGIAN));
        while (georgianIterator.hasNext()) {
            Channel c = georgianIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionListImpl();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(100.5, ChannelType.POLISH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.POLISH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.GEORGIAN));
        channels.addChannel(new Channel(106.5, ChannelType.GEORGIAN));
        channels.addChannel(new Channel(109.5, ChannelType.SPANISH));
        return channels;
    }
}
