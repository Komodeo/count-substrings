package com.grantgotgame.count_substrings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountSubstringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountSubstringsApplication.class, args);
	}

	public int countSubstrings(String str, String subStr) {
		// initialize count, subCount, strLength, subStrLength
		int count = 0;
		int subCount = 0;
		int strLength = str.length();
		int subStrLength = subStr.length();
		// loop through str
		for (int i = 0; i < strLength; i++) {
			// if first char of subStr matches char in str, increment subCount
			if (str.charAt(i) == subStr.charAt(subCount)) {
				subCount++;
				// if end of subStr is reached, increment count and reset subCount
				if (subCount == subStrLength) {
					count++;
					subCount = 0;
				}
			}
		}
		// return count
		return count;
	}

}
