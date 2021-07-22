package com.level2;

public class Fizzbuzz {

	public static void main(String[] args) {
//		1부터 100까지 숫자 출력하기
//		FizzBuzz는 매우 간단한 프로그래밍 문제이며 규칙은 다음과 같습니다.
//
//		1에서 100까지 출력
//		3의 배수는 Fizz 출력
//		5의 배수는 Buzz 출력
//		3과 5의 공배수는 FizzBuzz 출력
//		즉, 1부터 100까지 숫자를 출력하면서 3의 배수는 숫자 대신 'Fizz', 5의 배수는 숫자 대신 'Buzz',
//		3과 5의 공배수는 숫자 대신 'FizzBuzz'를 출력하면 됩니다.

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else {
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
