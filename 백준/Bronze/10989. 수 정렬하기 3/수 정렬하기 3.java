import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[i] = x;
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb);
		
	}
}

