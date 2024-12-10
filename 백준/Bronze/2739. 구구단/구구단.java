import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] multi = {1,2,3,4,5,6,7,8,9};

		Scanner in = new Scanner(System.in);
		int stage = in.nextInt();

		for(int i=0; i<=multi.length-1; i++){
			System.out.println(stage + " * " +  multi[i] +" = "+ stage * multi[i]);
		}
 
		in.close();
    }
}