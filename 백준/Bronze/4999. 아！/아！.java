import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String voice = br.readLine();
        String hospital = br.readLine();

        if (voice.length() >= hospital.length())
            bw.write("go");
        else
            bw.write("no");

        bw.flush();
        bw.close();
        br.close();
    }
}