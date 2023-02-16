Code chef : Pet Store - same multiset of animals for both or not?

Solution [Java]
---------------


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] type = new int[n];
            for(int i = 0; i<n; i++){
                type[i] = sc.nextInt();
            }
            Arrays.sort(type);
            if(n%2 ==0 ){
                int count = 0;
                for(int i = 0; i<n; i+=2){
                    if(type[i] == type[i+1]){
                        count++;
                    }
                }
                if(count == n/2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
