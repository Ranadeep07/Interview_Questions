// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
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
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	   //Stack<Integer> s = new Stack<>();
	Stack<Integer> reStack = new Stack<>();
	// 1 2 3
	int a[] = new int[s.size()];
	for (int i = 0; i < a.length; i++) {
		a[i] = s.get(i);
	}
	for(int i=0; i<a.length;i++ ) {
		int min = i;
		for (int j = 0; j < a.length; j++) {
			if(a[min]<a[j]) {
				min = j;
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
	for (int i = 0; i < a.length; i++) {
		reStack.push(a[i]);
	}
		return reStack;
	}

}
