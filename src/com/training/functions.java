package com.training;

public class functions
{
	public static int sayilariTopla (int sayi1, int sayi2)
	{
		int toplam=0;
		toplam = sayi1 + sayi2;
		return toplam;
	} 
	
	public static float sayilariBol (float sayi1, float sayi2) 
	{
		int a;
		float bolum=0;
		bolum=sayi1/sayi2;
		return bolum;
	}
	
	public static int sayilariCarp (int sayi1 , int sayi2) 
	{
		int carpim=0;
		carpim=sayi1*sayi2;
		return carpim;
	}
	
	public static int sayilariCikar (int sayi1 , int sayi2) 
	{
		int sonuc=0;
		sonuc=sayi1-sayi2;
		return sonuc;
	}
	
	public static int fact(int n) {
		int result;

		if (n == 1 || n==0)
		return 1;

		result = fact(n - 1) * n;
		return result;
	}
}
