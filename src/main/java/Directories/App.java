package Directories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException {

        SpringApplication.run(App.class, args);
        FileSystem fs = new FileSystem("");
    }
}
