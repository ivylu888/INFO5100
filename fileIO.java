import java.io.*;

public class fileIO {
  String read_file(String s)throws IOException{
    FileReader fr = new FileReader(s);
    BufferedReader br = new BufferedReader(fr);
    String line = "";
    int cur = 0;
    String arrays = new String();
    while((line = br.readLine()) != null && cur < 5){
      arrays += line + "\n";
      cur++;
    }
    br.close();
    fr.close();
    return arrays;
  }

  void write_file(String s, File file) throws IOException{
    InputStream input = new FileInputStream(file);
    OutputStream output = new FileOutputStream(new File(s));

    byte[] item = new byte[1024];
    int length;
    while((length = input.read(item)) > 0){
      output.write(item, 0, length);
    }
    input.close();
    output.close();
  }
}


