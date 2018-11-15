package uebungenAbfragen;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Bitte geben Sie das Jahr ein");
		int jahr = sc.nextInt();
		if (jahr%400 == 0 || jahr %4==0 && jahr %100 != 0)
			System.out.println("Das Jahr " +jahr+" ist ein Schlatjahr");
		else
			System.out.println("Das Das Jahr " +jahr+" ist kein Schlatjahr");

	}

}
