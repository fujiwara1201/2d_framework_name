package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	static void kadaiB() {
				Random random = new Random();
				int i = random.nextInt(100) + 1;
				System.out.println(i + 1 + "が出ました。");
			}
		}
