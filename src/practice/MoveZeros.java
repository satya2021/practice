package practice;

import java.util.Scanner;

public class MoveZeros {
public int[] moveZeros(int[] a) {
	int[] result = new int[a.length];
	int j=0;
	for(int i =0 ;i<a.length;i++) {
		if (a[i]!= 0){
			result[j]=a[i];
			j++;
		}
	}
	return result;
	
}
public static void main(String argsv[]) {
	MoveZeros m = new MoveZeros();
	int n;
    Scanner s = new Scanner(System.in);
    System.out.print("no. of elements");
    n = s.nextInt();
    int input[] = new int[n];
    int result[] = new int[n];
    System.out.println("Enter elements:");
    for(int i = 0; i < n; i++)
    {
    	input[i] = s.nextInt();
    }
    s.close();
    result =m.moveZeros(input);
    for(int i = 0; i < n; i++)
    {
    	 System.out.println(result[i]);
    }
    
}
}
