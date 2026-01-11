package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Champion;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		
		System.out.print("Nome: ");
		String firstChampionName = sc.nextLine();
		
		System.out.print("Vida Inicial: ");
		int firstChampionLife = sc.nextInt();
		
		System.out.print("Ataque: ");
		int firstChampionAttack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int firstChampionArmor = sc.nextInt();
		sc.nextLine();
		
		Champion firstChampion = new Champion(firstChampionName, firstChampionLife, firstChampionAttack, firstChampionArmor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		
		System.out.print("Nome: ");
		String secondChampionName = sc.nextLine();
		
		System.out.print("Vida Inicial: ");
		int secondChampionLife = sc.nextInt();
		
		System.out.print("Ataque: ");
		int secondChampionAttack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int secondChampionArmor = sc.nextInt();
		
		Champion secondChampion = new Champion(secondChampionName, secondChampionLife, secondChampionAttack, secondChampionArmor);
		
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < rounds; i++) {
			System.out.printf("Resultado do turno: %d %n", i + 1);
			
			firstChampion.takeDamage(secondChampion);
			
			secondChampion.takeDamage(firstChampion);
			
			if (firstChampion.getLife() <= 0 || secondChampion.getLife() <= 0) {
				System.out.println(firstChampion.status());
				System.out.println(secondChampion.status());
				break;
			}
			else if (firstChampion.getLife() > 0 && secondChampion.getLife() > 0){
				System.out.println(firstChampion.status());
				System.out.println(secondChampion.status());
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}

}
