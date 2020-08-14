package GFG;


import java.util.Scanner;
import java.util.Stack;

public class SortedStack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
			System.out.print(a.peek()+" ");
			a.pop();
			}
			System.out.println();
	}
}
}
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		int temp[] = new int[s.size()];
		for (int i = 0; i < s.size(); i++) {
			temp[i] = s.get(i);
		}
		for(int i=0;i<temp.length;i++)
		{
			int min = i;
			for(int j=0;j<temp.length;j++)
			{
				if(temp[min]<temp[j])
				{
					min = j;
				}
				int tem = temp[min];
				temp[min] = temp[i];
				temp[i] = tem;
			}
		}
		s.clear();
		for(int i:temp)
		{
			s.push(i);
		}
		return s;
	}
}
