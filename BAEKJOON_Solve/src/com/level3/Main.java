package com.level3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = sc.nextInt() % 42;
		}
		for (int i = 0; i < nums.length; i++) {
			int temp = 0;

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					temp++;
				}
			}
			if (temp==0) {
				count++;
			}
			
		}
		System.out.println(count);

	}

	private void Finn() {

		// 10818 최소 최대
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int max = -1000000;
//		int min = 1000000;
//		int[] nums = new int[num];
//
//		for (int i = 0; i < num; i++) {
//			nums[i] = sc.nextInt();
//			if (nums[i] > max) {
//				max = nums[i];
//			}
//
//			if (i == 0) {
//				min = nums[i];
//			} else if (nums[i] < min) {
//				min = nums[i];
//			}
//		}
//		System.out.printf("%d %d", min, max);

		// Q 2562 최댓값
//		Scanner sc = new Scanner(System.in);	
//		int max = 0, min = 100;
//		int count = 0;
//		int[] nums = new int[9];
//
//		for (int i = 0; i < 9; i++) {
//			nums[i] = sc.nextInt();
//			if (nums[i] > max) {
//				max = nums[i];
//				count = i+1;
//			}
//			if (nums[i] < min) {
//				min = nums[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(count);

//		// 2577 숫자의 개수
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//
//		int sum = a * b * c;
//		String strsum = Integer.toString(sum);
//		char ch;
//		int count = 0;
//
//		for (int i = 0; i <= 9; i++) {
//			char cha = Integer.toString(i).charAt(0);
//			for (int j = 0; j < strsum.length(); j++) {
//				char cha2 = strsum.charAt(j);
//				if (cha == cha2) {
//					count++;
//				}
//			}
//			System.out.println(count);
//			count = 0;
//		}

//		// 8958 OX퀴즈
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int score = 0, sum = 0;
//		for (int j = 0; j < num; j++) {
//			score = sum = 0;
//			String str = sc.next();
//			for (int i = 0; i < str.length(); i++) {
//				char chs = str.charAt(i);
//				if (chs == 'O') {
//					score++;
//					sum += score;
//				} else {
//					score = 0;
//				}
//			}
//			System.out.println(sum);
//		}

//		// 4344 평균은 넘겠지
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		double sum = 0;
//		double avg = 0;
//		int count = 0;
//		for (int j = 0; j < num; j++) {
//			sum = avg = count = 0;
//			int num2 = sc.nextInt();
//			int[] scores = new int[num2];
//
//			for (int i = 0; i < scores.length; i++) {
//				scores[i] = sc.nextInt();
//				sum += scores[i];
//			}
//			avg = sum / num2;
////			System.out.println("평균" + avg);
//			for (int k = 0; k < scores.length; k++) {
//				if (scores[k] > avg) {
//					count++;
//				}
//			}
//			double result = (double) count / num2 * 10000.0 / 100.0;
//			System.out.printf("%.3f%%%n", result);

	}

}
