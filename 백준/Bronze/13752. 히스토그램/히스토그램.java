import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            for (int j = 1; j <= k; j++) {
                bw.write("=");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
    }
}