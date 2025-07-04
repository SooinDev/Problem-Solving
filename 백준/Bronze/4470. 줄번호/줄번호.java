import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String txt = br.readLine();
            bw.write(Integer.toString(i + 1) + ". " + txt + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}