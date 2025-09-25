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
		int temp=0;
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    int minIndex = i;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]<arr[minIndex]){
		            minIndex=j;
		        }
		    }
		    temp = arr[i];
		    arr[i]=arr[minIndex];
		    arr[minIndex]=temp;
		}
		for(int num:arr){
		    System.out.print(num+" ");
		}
	}
}
