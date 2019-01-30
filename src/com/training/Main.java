package com.training;
import java.util.Scanner;

import com.training.functions;
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println(functions.sayilariTopla(5, 7));
		System.out.println(functions.sayilariBol(5, 7));
		System.out.println(functions.sayilariCarp(5, 7));
		System.out.println(functions.sayilariCikar(5, 7));
		
		int girilensayi;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Faktoriyeli alinacak sayi: " );
		girilensayi=klavye.nextInt(); 
		int a = functions.fact(girilensayi);
		System.out.println(girilensayi + "! = " + a);
	}
}
