import Directories.FileSystem;
import Directories.FilterByMimeType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {

    @Test
    public void testGetDirectory() {
        FileSystem fs = new FileSystem("");
        fs.setDirectory("");
        assert fs.getDirectory().equals("");
    }

    @Test
    public void testGetFileName() {
        FileSystem fs = new FileSystem("Book1.csv");
        assert fs.getNameOfFile().equals("Book1.csv");
    }

    @Test
    public void testGetMimeType() {
        FileSystem fs = new FileSystem("Book1.csv");
        assert fs.getFileMimeType().equals("application/octet-stream");
    }

    @Test
    public void testGetSize(){
        FileSystem fs = new FileSystem("Book1.csv");
        assert fs.getSize().equals("9 Bytes");
    }

    @Test
    public void testGetFileExtension(){
        FileSystem fs = new FileSystem("Book1.csv");
        assert fs.getExtension().equals("csv");
    }

    @Test
    public void testFilterByMimeGetDirectory(){

        FilterByMimeType sf = new FilterByMimeType("");
        sf.setDirectory("/EndToEnd");
        assert sf.getDirectory().equals("/EndToEnd");

    }

    @Test
    public void testFilterByMimeGetSpecificMime(){
        FilterByMimeType sf = new FilterByMimeType("pdf");
        List<String> ls = new ArrayList<>();
        ls.add("Doc4.pdf");
        assert sf.getSpecificFileType().contains(ls.get(0));
    }
}
