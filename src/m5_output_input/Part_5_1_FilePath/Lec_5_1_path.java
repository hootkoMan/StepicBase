package m5_output_input.Part_5_1_FilePath;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Lec_5_1_path {
    public void workWithPathFile() {
        Path path = Paths.get("/prj/java/one");
        File fromPath = path.toFile();
        Path fromFile = fromPath.toPath();

        path.isAbsolute();
        path.getFileName();
        path.getParent();

        path.getNameCount(); // 3
        path.getName(1); // java
        path.resolveSibling("javap"); // prj/java/javap
        path.startsWith("/prj"); // true
        Paths.get("/prj").relativize(path); // java/one

        Path java = Paths.get("/usr/bin/java");
        Files.exists(java);
        Files.isRegularFile(java);
        try {
            Files.size(java);
            Files.getLastModifiedTime(java).toMillis();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //copy file
        try {
            Files.copy(java,
                Paths.get("usr/bin/java_copy"),
                StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        // directories
        Path usrbin = Paths.get("/usr/bin");
        Files.exists(usrbin);
        Files.isDirectory(usrbin);

        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(usrbin)){
            for (Path child : dirStream) {
                System.out.println(child);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.createDirectory(usrbin);
            Files.createDirectories(usrbin);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
