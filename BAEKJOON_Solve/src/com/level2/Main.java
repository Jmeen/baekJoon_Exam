package com.level2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//!2920
		Scanner sc = new Scanner(System.in);
		String a = sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next();
		int b = Integer.parseInt(a);
		System.out.println(b == 12345678? "ascending" : b==87654321 ? "descending" : "mixed");
		
 

	}

	private static void finEX() {
		// 1330
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		String result = a > b ? ">" : a < b ? "<" : "==";
//		System.out.println(result);
//		
//		
//		//Q2753
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		String r = "";
//
//		if (a >= 90) {
//			r = "A";
//		} else if (a >= 80) {
//			r = "B";
//		} else if (a >= 70) {
//			r = "C";
//		} else if (a >= 60) {
//			r = "D";
//		} else {
//			r = "F";
//		}		;
//		System.out.println(r);

//		//IF문 윤년
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		if ((year % 4 == 0) && (year % 100 != 0)) {
//			System.out.println(1);
//		} else if (year % 400 == 0) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}

//		// iF문 사분면 고르기
//				Scanner sc = new Scanner(System.in);
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				int r;
//				
//				System.out.println(a>0? b>0? "1": "4":b>0?"2":"3");
//				
//				if (a > 0) {
//					if (b > 0) {
//						r = 1;
//					} else {
//						r = 4;
//					}
//				} else {
//					if (b > 0) {
//						r = 2;
//					} else {
//						r = 3;
//					}
//				}
//				System.out.println(r);

//		Scanner sc = new Scanner(System.in);
//		int H = sc.nextInt();
//		int M = sc.nextInt();
//		int modi_m;
//		int Modi_h;
//		
//		if ((M-45)<0) {
//			modi_m=(60+M)-45;
//			if(H-1<0) {
//				Modi_h=23;
//			}else {
//			Modi_h=H-1;
//			}
//		}else {
//			modi_m=M-45;
//			Modi_h=H;
//		}
//		System.out.println(Modi_h +" "+modi_m);	
//	}
//		//Q11654
//		Scanner sc = new Scanner(System.in);
//		System.out.println((int)(sc.next().charAt(0)));
//
//		//Q2920
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next();
//		int b = Integer.parseInt(a);
//		System.out.println(b == 12345678? "ascending" : b==87654321 ? "descending" : "mixed");
//		
		
	}

}
