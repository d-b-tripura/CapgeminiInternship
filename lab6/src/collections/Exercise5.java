package collections;

import java.util.*;

public class Exercise5 {
	
	public static int getSecondSmallest(int[] a) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		Collections.sort(l);
		return l.get(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(a));

	}

}
