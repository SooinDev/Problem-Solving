import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            String grade = "";

            if (name.equals("#") && age == 0 && weight == 0)
                break;
            else {
                if (age > 17 || weight >= 80)
                    grade = "Senior";
                else
                    grade = "Junior";

                bw.write(name + " " + grade + "\n");
            }
        }

        br.close();
        bw.close();
    }
}