package OOPS;

class Test {   
    Test (byte a, byte b) {}   
    
    Test(short a, short b){}
 
    static int go(byte a, byte b) { return a+b; }   
    static int go(short a, short b) { return a-b; }    
 
    public static void main(String[] args) {      
        byte b1 = 65, b2 = 65; 
        short s1=65,s2=65;
        System.out.println(go(b1, b2)); // prints 65      
        System.out.println(go(s1, s2)); // compile-time error      
        Test t1 = new Test(b1, b2); // fine      
        Test t2 = new Test(s1, s2); // compile-time error   
    } 
}