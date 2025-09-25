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
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            temp = arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int num:arr){
		    System.out.print(num+" ");
		}
	}
}
