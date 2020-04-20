import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {
    @Override
    public long calculateSize(String path) {
        com.codegym.FileUtil fileUtil = new com.codegym.FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
