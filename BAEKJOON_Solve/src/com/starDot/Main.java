package com.starDot;

//Q2442
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Q2445 별찍기 8
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = num;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k < 2 * x - 1; k++) {
				System.out.print(" ");
			}
			for (int f = 0; f <= i; f++) {
				System.out.print("*");
			}
			x--;
			System.out.println();
		}
		int y = num - 1;
		for (int i = 1; i < num; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");

			}
			for (int k = 0; k <= 2 * i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			y--;
			System.out.println();

		}

	}

	private static void q2440() {
		// Q2440 별찍기 3
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	private static void q2441() {
		// q2441 별찍기 4
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//			int n = 5;				;
		int s = n;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < s; j++) {
				System.out.print("*");
			}
			System.out.println();
			s -= 1;
		}
	}

	private static void q2442() {
		// 별찍기 5
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 5;
		int x = 2 * n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < x / 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= (2 * i + 1 - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
			x -= 2;
		}
	}

// 별찍기 6
	private static void q2443() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 5;
		int z = n;
		int x = 2 * n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < ((2 * z) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
			z--;
		}
	}

//	//Q2444 별찍기 7
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//			for (int i = 1; i <= num; i++) {
//				for (int j = i + 1; j <= num; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k < (2 * i - 1); k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			int x = num - 1;
//			for (int i = 1; i < num; i++) {
//				for (int j = 1; j < i + 1; j++) {
//					System.out.print(" ");
//				}
//				for (int k = 0; k < (2 * x) - 1; k++) {
//					System.out.print("*");
//				}
//				x--;
//				System.out.println();
//			}}
//	// Q2445 별찍기 8
//	Scanner sc = new Scanner(System.in);
//	int num = sc.nextInt();
//	int x = num;
//
//	for (int i = 0; i < num; i++) {
//		for (int j = 0; j <= i; j++) {
//			System.out.print("*");
//		}
//		for (int k = 1; k < 2 * x - 1; k++) {
//			System.out.print(" ");
//		}
//		for (int f = 0; f <= i; f++) {
//			System.out.print("*");
//		}
//		x--;
//		System.out.println();
//	}
//	int y = num - 1;
//	for (int i = 1; i < num; i++) {
//		for (int j = 0; j < y; j++) {
//			System.out.print("*");
//
//		}
//		for (int k = 0; k <= 2 * i - 1; k++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < y; j++) {
//			System.out.print("*");
//		}
//		y--;
//		System.out.println();
//
//	}

}
