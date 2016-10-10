package m5_output_input;

import java.io.File;
import java.io.IOException;

public class Lec_5_1 {
    public static void main(String[] args) {

        File winExample = new File("C:\\doc\\someFile.txt");

        File networkFolder = new File("\\\\server\\share");

        File unixExample = new File("/usr/bin/ls");

        //Разделитель
        String sourceDirName = "src";
        String mainFileName = "Main.java";
        // разделители для разных ОС
        String separator = File.separator;
        char separatorChar = File.separatorChar;

        // разделение путей  : ;
        String string = File.pathSeparator;
        char aChar = File.pathSeparatorChar;

        String mainFilePath = sourceDirName
            + separator
            + mainFileName;

        File mainFilepath2 = new File(sourceDirName, mainFileName);

        // абсолютные и относительные пути
        File absoluteFile = new File("/usr/bin/java");
        absoluteFile.isAbsolute(); // true
        absoluteFile.getAbsolutePath(); // /usr/bin/java

        File relativeFile = new File("reading.txt");
        relativeFile.isAbsolute(); // false
        relativeFile.getAbsolutePath(); // -> String (/usr/bin/java/reading.txt)
        relativeFile.getAbsoluteFile(); // -> File

        File file = new File("/usr/bin/java");
        String path = file.getPath(); // /usr/bin/java
        String name = file.getName(); // java
        String parent = file.getParent(); // /usr/bin
        File file1 = file.getParentFile(); // /usr/bin/java

        File file2 = new File("./prj/../symlink.txt");
        try {
            // обращение к диску
            String canonicalPath = file2.getCanonicalPath();
            File canonicalFile = file2.getCanonicalFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
