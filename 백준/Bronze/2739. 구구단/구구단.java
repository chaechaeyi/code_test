import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 BufferedReader로 처리
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int stage = Integer.parseInt(reader.readLine()); // 입력값 정수로 변환


        // StringBuilder를 사용해 출력 효율 개선
        StringBuilder output = new StringBuilder();


        for (int i = 1; i <= 9; i++) { // 1부터 9까지 반복
            output.append(stage).append(" * ").append(i).append(" = ").append(stage * i).append("\n");
        }


        // 한 번에 출력
        System.out.print(output);
    }
}




