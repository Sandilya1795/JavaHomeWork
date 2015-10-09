/**
 * Created by 1795 on 2-10-2015.
 */

import java.io.IOException;
import java.nio.file.*;

public interface ReadAndCompare {

    void readCompareText(Path p1, Path p2) throws IOException;
}
