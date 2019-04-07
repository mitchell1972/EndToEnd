package Directories;


import Directories.FileSystem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileSystemController {
FileSystem sf = null;
    @RequestMapping(path = "/name")
    public FileSystem name(@RequestParam(value = "fileName", defaultValue = "") String fileName) {
        FileSystem fs = new FileSystem(fileName);
        return fs;
    }

    @RequestMapping(path = "/supported-mime-type")
    public FilterByMimeType setDirectory(@RequestParam(value = "mimeType", defaultValue = "") String mimeType) throws IllegalAccessException, InstantiationException {
        FilterByMimeType filterByMimeType = new FilterByMimeType(mimeType);
        return filterByMimeType;
    }
}
