package exercises;

import java.util.*;

interface Power{
	public double doPower(int x, int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise1 obj = new Exercise1();
		obj.doPower();
	}
	void doPower() {
		Power p = (x,y) -> Math.pow(x, y);
		double res = p.doPower(2, 4);
		System.out.println(res);
		
	}

}
