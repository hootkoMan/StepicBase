package m5_output_input.Part_5_1_FilePath;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Lec_5_1_fileSystem {
    public void fileSys() throws IOException {

        Path zippath = Paths.get("temp/somefile.zip");

        try (FileSystem zipfs = FileSystems.newFileSystem(zippath, null)) {
            for (Path path : zipfs.getRootDirectories()) {
                Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        System.out.println(file);
                        return FileVisitResult.CONTINUE;
                    }
                });
            }
        }
    }
}
