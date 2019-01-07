package com.navi.str;
public class StringTest {

	public static void main(String[] args) {
		
		String s1= "abc";
		String s2 = "abc";
		String s3 = new String ("abc");
		String s4 = s1;
		
		System.out.println("s1 ==s2"+ s1==s2);
		System.out.println("s1==s3"+s1==s3);
		System.out.println("s1==s4"+s1==s4);
		System.out.println("s1 equals s4 "+s1.equals(s3));
		System.out.println("s1 equals s2 "+s1.equals(s2));
	}

}
