import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String answer = "";

        for (int i = 1; i <= N; i++) {
            answer = answer + i + " ";

            if (i % 6 == 0)
                answer = answer + "Go! ";
            else if (i == N)
                answer = answer + "Go!";
        }
        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}