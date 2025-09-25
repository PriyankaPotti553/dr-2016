import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		for(int i=1;i<arr.length;i++){
		    int key = arr[i];
		    int j=i-1;
		    while(j>=0&&arr[j]>key){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=key;
		}
		for(int num:arr){
		    System.out.print(num+" ");
		}
	}
}
