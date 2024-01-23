package com.ssafy.day4;

import java.util.Arrays;
import java.util.Scanner;

public class StringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac10();
		
	}
	
	public static void prac1() {
		String str1 = "Hell";
		String str2 = "o Wor";
		String str3 = "ld";
		String str4 = str1 + str2 + str3;
		System.out.println(str4);
	}
	
	public static void prac2_2() {
		String str = "my name is ola.";
		for ( int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				if ( str.charAt(i+1) == 'l') {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void prac3() {
		String str = "    Hello World      ";
		System.out.println(str.trim());
	}
	
	public static void prac4_1() {
		Scanner sc = new Scanner(System.in);
		char[][] chr = new char[3][5];
		for ( int i = 0; i < 3; i++) {
			for ( int j = 0; j < 5; j++) {
				chr[i][j] = sc.next().charAt(0);
			}
		}
		
		for ( char[] line : chr) {
			System.out.println(Arrays.toString(line));
		}
	}
	
	public static void prac4_2() {
		Scanner sc = new Scanner(System.in);
		char[][] chr = new char[3][5];
		for ( int i = 0; i < 3; i++) {
			for ( int j = 0; j < 5; j++) {
				chr[i][j] = sc.next().charAt(0);
			}
		}
		
		for ( char[] line : chr) {
			System.out.println(line);
		}
	}
	
	public static void prac5_1() {
		String str1 = "Lorem ipsum dolor sit amet";
		String str2 = "Lorem ipsum dolor sit amet";
		String str3 = str1.equals(str2) ? "일치" : "불일치";
		System.out.println(str3);
	}
	
	public static void prac5_2() {
		String str1 = "LorEm ipsUm Dolor Sit AmeT";
		String str2 = "LOrem iPsum dOlor siT amEt";
		String str3 = str1.toUpperCase().equals(str2.toUpperCase()) ? "일치" : "불일치";
		System.out.println(str3);
	}
	
	public static void prac6() {
		String str = "Hello World";
		System.out.println(str.length());
	}
	
	public static void prac7() {
		String str = "Hello World";
		System.out.println(str.substring(3, 9));
	}
	
	public static void prac8_1() {
		Scanner sc = new Scanner(System.in);
		while( true ) {
			String str = sc.next();
			if (str.charAt(str.length() - 2) == 'a') {
				if ( str.charAt(str.length()-1) == 'b') {
					System.out.println(true);
				} else System.out.println(false);
			}else System.out.println(false);
		}
	}
	
	public static void prac9() {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam velit metus, porta non tincidunt non, blandit ut nisl. Sed nulla quam, lacinia vel dolor non, efficitur consequat elit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Fusce condimentum sapien vitae tellus consequat, vel suscipit est ultrices. Sed ac rhoncus mi. Nunc euismod semper luctus. Ut in est sed diam malesuada blandit ut non risus. Aenean malesuada elit et lectus feugiat, vitae maximus urna commodo. Proin varius felis sed augue eleifend, condimentum vulputate lacus pellentesque.";
		for ( int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("em")) {
				str = str.substring(0, i) + "ab" + str.substring(i+2,str.length());
				}
		}
		System.out.println(str);
	}
	
	public static void prac10() {
		String str = "Donec mauris augue rhoncus ut leo at auctor blandit est";
		String[] array = str.split(" ");
		for ( String arr : array) {
			System.out.println(arr);
		}
	}

}
