package java_basics;

public class MethodOverload {
    // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html

	static void go(int[] array) {
		System.out.println("array[0]: " + array[0]);
		System.out.println("array[1]: " + array[1]);
		
		array[1] = 22;
	}
	
	static void go(int i) {
		System.out.println("go(int i)");
	}
	
	static void go(short s) {
		System.out.println("go(short s)");
	}
  
	public static void main(String[] args) {	
	  int[] array = {1, 2};
	  go(array);
	  System.out.println("array[1]: " + array[1]);
	  
	  byte b = 22;
	  go(b);
    }       
  }