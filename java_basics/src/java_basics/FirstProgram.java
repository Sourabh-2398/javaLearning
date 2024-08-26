
package java_basics;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int b=s.nextInt();
        System.out.println("Hello " + a + " and your age is " + b);
        s.close();
	}

}
