package Directories;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.io.Files.getFileExtension;

public class FileSystem {

    private String directory;
    private String fileName;
    private String mimeType;
    private String sizeOfFile;
    private String extension;
    private String specificFileType;
    private List<File> files = new ArrayList<>();
    private List<String> fileNames = new ArrayList<>();


    public FileSystem(String name){
        setDirectory("File/");
        configureDirectory();
        getFileNameAndProperties(name);
        getNameOfFile();
        getFileMimeType();
        getSize();
        getExtension();
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {

        return this.directory;
    }

    public void getFileNameAndProperties(String name){
        setFileNames();
        for (String a: fileNames) {
            if(a.contains(name)){
                MimetypesFileTypeMap fileTypeMap = new MimetypesFileTypeMap();
                String fileMimeType = fileTypeMap.getContentType(a);
                this.fileName = a;
                this.mimeType = fileMimeType;
                this.sizeOfFile = Long.toString(a.length())+" Bytes";
                this.extension = getFileExtension(a);
                System.out.println();
                System.out.print("File Name: ");
                System.out.print(fileName);
                System.out.println();
                System.out.print("Mime Type: ");
                System.out.print(mimeType);
                System.out.println();
                System.out.print("File Size: ");
                System.out.print(sizeOfFile+ " bytes");
                System.out.println();
                System.out.print("File Extension: ");
                System.out.print(extension);
                System.out.println();
            }
        }
    }

    public String getNameOfFile(){
        return this.fileName;
    }

    public String getFileMimeType(){
        return this.mimeType;
    }

    public String getSize(){
        return this.sizeOfFile;
    }

    public String getExtension(){
        return this.extension;
    }


    public void setFileNames(){
        for(File a: files){
            fileNames.add(a.getName());

        }
    }

    public void configureDirectory() {
        File dir = new File(directory);
        File[] files = dir.listFiles();
        this.files = Arrays.asList(files);
    }

    public void getDirectoryContent(){
        files.forEach(a -> System.out.println(a.getName()));
    }

}
