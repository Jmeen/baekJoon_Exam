package com.starDot;

//Q2442
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

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

}
