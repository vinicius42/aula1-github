package ascii;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class SmallBinaryFiles {
  
  public static void main(String... args) throws IOException {
    SmallBinaryFiles binary = new SmallBinaryFiles();
    byte[] bytes = binary.readSmallBinaryFile(FILE_NAME);
    log("Small - size of file read in:" + bytes.length);
    binary.writeSmallBinaryFile(bytes, OUTPUT_FILE_NAME);
  }

  final static String FILE_NAME = "D://testeBinario.bin";
  final static String OUTPUT_FILE_NAME = "D://aaa.txt";
  
  byte[] readSmallBinaryFile(String fileName) throws IOException {
    Path path = Paths.get(fileName);
    return Files.readAllBytes(path);
  }
  
  void writeSmallBinaryFile(byte[] bytes, String fileName) throws IOException {
    Path path = Paths.get(fileName);
    Files.write(path, bytes);
  }
  
  private static void log(Object msg){
    System.out.println(String.valueOf(msg));
  }
}
