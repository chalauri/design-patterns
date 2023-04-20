package ge.edu.sangu.iterator.interfaces;

import ge.edu.sangu.iterator.channel.Channel;

public interface ChannelIterator {
    boolean hasNext();

    Channel next();
}
