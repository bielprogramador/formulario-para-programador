package projeto;

import java.util.Scanner;

public class Formulario {
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Qual é seu nome: ");
		String nome = enter.next();

		System.out.print("Quantos anos: ");
		String idade = enter.next();
		
		System.out.print("Você codifica com:  ");
		String linguagem = enter.next();
		
		System.out.print("Você trabalha na área: ");
		String trabalho = enter.next();
		
		String cargo = "";
		
		 if (trabalho.equalsIgnoreCase("sim")) {
	            System.out.print("Qual cargo: ");
	            cargo = enter.next();
	     }
		
		if(cargo.equals("sim")){
			System.out.print("Qual cargo: ");
			cargo = enter.next();
		}else if(cargo.equalsIgnoreCase("estagiario")
				||  cargo.equalsIgnoreCase("estagiário de desenvolvimento")){
			System.out.println("\nUauu!!\n");
		}else if(cargo.equalsIgnoreCase("júnior")
				|| cargo.equalsIgnoreCase("desenvolvedor junior")
				||  cargo.equalsIgnoreCase("desenvolvedor de software júnior")){
			System.out.println("\nAí sim!\n");
		}else if(cargo.equalsIgnoreCase("pleno")
				|| cargo.equalsIgnoreCase("desenvolvedor pleno")
				|| cargo.equalsIgnoreCase("desenvolvedor de software pleno")){
			System.out.println("\nCaraca párabens!\n");
		}else if(cargo.equalsIgnoreCase("sênior")
				|| cargo.equalsIgnoreCase("senior")
				|| cargo.equalsIgnoreCase("desenvolvedor senior")
				|| cargo.equalsIgnoreCase("desenvolvedor sênior")
				|| cargo.equalsIgnoreCase("desenvolvedor de software sênior")
				|| cargo.equalsIgnoreCase("desenvolvedor de software sênior")){
			System.out.println("\nNossa, que bacana!\n");
		}else if(cargo.equals("pleno")
				|| cargo.equalsIgnoreCase("desenvolvedor pleno")
				|| cargo.equalsIgnoreCase("desenvolvedor de software pleno")){
			System.out.println("\nMeus Párabens!\n");
		}else{
			System.out.println("\nPárabens!");
			System.out.println("Seu formulário\n");
		}
		System.out.println("Seu nome: " + nome + "\nSua idade: " + idade + "\nSua linguagem: " + linguagem);
		
		
		
		enter.close();
	}
		
}
