package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	static void kadaiA() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}
<<<<<<< HEAD
=======
		
		static void kadaiB() {
			Random random = new Random();
			int i = random.nextInt(100) + 1;
			System.out.println(i + 1 + "が出ました。");
		}


>>>>>>> branch 'master' of https://github.com/fujiwara1201/2d_framework_name.git
	static void kadaiC() {
	//ここに課題を書く。メソッド名変えてね。
	int a = 50;
	int b = 75;
	int c = a+b;
	
	System.out.println(c);
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/fujiwara1201/2d_framework_name.git
	}
}
