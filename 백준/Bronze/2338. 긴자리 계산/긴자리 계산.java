import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        bw.write(A.add(B) + "\n");        // A + B
        bw.write(A.subtract(B) + "\n");   // A - B
        bw.write(A.multiply(B) + "\n");   // A * B

        bw.flush();
        bw.close();
        br.close();
    }
}