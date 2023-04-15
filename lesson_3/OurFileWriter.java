import java.io.FileWriter;

public class OurFileWriter {
    String fileName;
    String fileData;

    public OurFileWriter(String fileName, String fileData) {
        this.fileName = fileName;
        this.fileData = fileData;
    }

    public void writeFile() throws FileNotExistException {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(fileData);
            System.out.println("Файл успешно записан!");
        } catch (Exception e) {
            throw new FileNotExistException(
                    "Catched Exception: " + e.getClass().getSimpleName() + "\nЗапись в файл не выполнена!", e);
        }
    }
}
