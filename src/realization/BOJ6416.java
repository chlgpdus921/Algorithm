package realization;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ6416 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
	
		int j=1,p = 1, size=0, a=1;
		String temp;
		int tree = 0;
int u=1;
int t;
		while (true) {
			temp = br.readLine();
			if(temp.isEmpty())
				continue;
			StringTokenizer st = new StringTokenizer(temp, " ");
			while(st.hasMoreTokens()){
			 j =  Integer.parseInt(st.nextToken());
			 u = Integer.parseInt(st.nextToken());
				/*if (!st.hasMoreTokens())
					st = new StringTokenizer(br.readLine(), " ");*/
			linkedList.add(j);		
	linkedList.add(u);	
			}
		
			if(j<0 && u <0)
				break;
			if(j==0 && u ==0){
				for(int i =0; i<linkedList.size(); i++){
					
				}
			for(int i =1; i<linkedList.size()-2; i=i+2){
					for(int k =1; k<linkedList.size()-2; k= k+2){
						if(linkedList.get(i) == linkedList.get(k)){
							tree++;			
						}
					}	
					size++;
				}
				if(tree !=size){
					System.out.println("Case "+a + " is not a tree.");		
					a++;
				}
				else if(tree == size){
					System.out.println("Case "+a + " is a tree.");
					a++;
				}
				for(int i =0; i<linkedList.size(); i++){
					linkedList.remove(i);
				}
				tree=0;
				size=0;
			}
				u=1;
				j=1;
			

		}

	}
}
