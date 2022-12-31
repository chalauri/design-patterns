package ge.edu.sangu.command.util;

import ge.edu.sangu.command.implementations.UnixFileSystemReceiver;
import ge.edu.sangu.command.implementations.WindowsFileSystemReceiver;
import ge.edu.sangu.command.interfaces.FileSystemReceiver;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
