package com.level2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Q1110
		int n = sc.nextInt();
		int a = n;
		int newnum = 0;
		int count = 0;
		if(n!=0) 
		{
			while (n != newnum) {
				newnum = ((a % 10) * 10) + (((a % 10) + (a / 10)) % 10);
				count++;
				a = newnum;
				}
		} 
		else		{
			count++;
		}
			
		System.out.println(count);
	}
//		

//		
//		while (sc.hasNextInt()) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a + b);
//		}

//		for (int i = 1; i < n + 1; i++) {
//			for(int j = 1; j<=i ;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		while (true) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			if (a == 0 && b == 0) {
//				break;
//			} else {
//				System.out.println(a + b);
//			}
//		}
//		sc.close();
//	}

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
		// !2920
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next()+sc.next();
//		int b = Integer.parseInt(a);
//		System.out.println(b == 12345678? "ascending" : b==87654321 ? "descending" : "mixed");

//		// Q4101
//		Scanner sc = new Scanner(System.in);
//		boolean ck = true;
//		while (ck) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			if ((x != 0) && (y != 0)) {
//				if (x > y) {
//					System.out.println("Yes");
//				} else if (x <= y) {
//					System.out.println("No");
//				}
//			} else {
//				ck = false;
//			}
//			sc.close();
//		}
//		
//		// Q4892
//				Scanner sc = new Scanner(System.in);
//				int count = 1;	
//				while (true) {
//
//					int n0 = sc.nextInt();
//					String r;
//					if (n0 == 0) {
//						break;
//					} else {
//						int n1 = 3 * n0;
//						int n2 = 0, n3 = 0, n4 = 0;
//						if (n1 % 2 == 0) {
//							n2 = n1 / 2;
//							r="even";
//							
//						} else {
//							n2 = (n1 + 1) / 2;
//							r="odd";
//						}
//						n3 = 3 * n2;
//						n4 = n3 / 9;
//
//						System.out.println(count+". "+r+" "+n4);
//						count+=1;
//	}
		// Q2739
//		Scanner sc = new Scanner(System.in);
//
//		int a = sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			System.out.println(a + " * " + i + " = " + (a * i));
//		}
//
//		// Q10950
//		int t = sc.nextInt();
//		for (int i = 0; i < t; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a + b);

		// Q2741
//	int n = sc.nextInt();
//	for (int i = 0; i<n;i++) {
//		System.out.println(i+1);
//	}
		// Q2742
//		int n = sc.nextInt();
//		int m = n;
//		for (int i = 0; i < n; i++) {
//			System.out.println(m);
//			m -= 1;
//		}
//		// Q11021
//		int n = sc.nextInt();
//
//		for (int i = 1; i < n+1; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println("Case #"+i+": "+(a+b));
//
//	}
//		Scanner sc = new Scanner(System.in);
//		// Q2439
//		int n = sc.nextInt();
//		int k = 0;
//		for (int z = 0; z < n; z++) {
//			for (int i = z; i < n - 1; i++) {
//				System.out.print(" ");
//				k++;
//			}
//			for (int j = 0; j < n - k; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			k = 0;
//		}
	}
}
