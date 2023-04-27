package br.com.residencia.poo.teste;

import java.util.Scanner;


public class PrimeiroExercicio {

	public static void main(String[] args) 
	{
		String nome, sobrenome;
		int idade;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		nome = sc.next();
		System.out.println("Digite sobrenome:");
		sobrenome = sc.next();
		
		System.out.println("Seu nome é "+nome+" "+sobrenome);

		System.out.println("\n");
		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();
		
		System.out.println ("Olá"+" " +nome+ "" +sobrenome+"");
		sc.close();
    }
}       