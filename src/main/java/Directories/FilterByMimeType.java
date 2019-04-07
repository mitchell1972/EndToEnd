package Directories;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterByMimeType {


    private String directory;
    private List<String> specificFileType = new ArrayList<>();
    private List<File> files = new ArrayList<>();



    public FilterByMimeType(String mimeType){
        setDirectory("File/");
        configureDirectory();
        getSpecificFileMimeType(mimeType);
        getDirectory();
        getSpecificFileType();
    }

    public String getDirectory() {

        return this.directory;
    }

    public List<String> getSpecificFileType(){
        return this.specificFileType;
    }

    public void getSpecificFileMimeType(String suffix){
        List<File> ls = files;
        for(File a:ls){
            if(a.getName().contains(suffix)) {
                this.specificFileType.add(a.getName());
                System.out.println(a.getName());
            }
        }
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void configureDirectory() {
        File dir = new File(directory);
        File[] files = dir.listFiles();
        this.files = Arrays.asList(files);
    }
}
