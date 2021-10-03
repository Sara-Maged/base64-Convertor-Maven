package com.codebind;

import java.util.Base64;
import java.util.Scanner;
import java.util.Base64.Encoder;

public class base64ConvertorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your Name");
		Scanner scan =new Scanner(System.in);
		String input = scan.nextLine();
		
		System.out.println("Hello "+input);
		
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(input.getBytes());
		
		System.out.print("Encoded Name: "+encodedString);
	}
}
