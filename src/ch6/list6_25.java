package ch6;

import java.io.File;
import java.util.List;

public class list6_25{
    interface FileConntentProcessor {
        void processContents(File path, byte[] binaryContents, List<String> textContents);
    }
}