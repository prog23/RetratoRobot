package RetratoRobot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int opcionPelo;
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////");
			System.out.println("3 - |\"\"\"\"\"\"\"|");
			System.out.println("4 - |||||||||");
			System.out.println("Introduce el numero de la opcion elegida (1-4)");
			opcionPelo=sc.nextInt();
			if (opcionPelo < 1 || opcionPelo > 4 )
				System.out.println("La opcion elegida no es correcta. Vuelve a introducir otra opcion correcta");
		}while(opcionPelo < 1 || opcionPelo > 4 );
		
		
		int opcionOjos;
		do {
			System.out.println("1 - |  O O  |");
			System.out.println("2 - |-(· ·)-|");
			System.out.println("3 - |-(o o)-|");
			System.out.println("4 - | \\  /  |");
			System.out.println("Introduce el numero de la opcion elegida (1-4)");
			opcionOjos=sc.nextInt();
			if (opcionOjos < 1 || opcionOjos > 4 )
				System.out.println("La opcion elegida no es correcta. Vuelve a introducir otra opcion correcta");
		}while(opcionOjos < 1 || opcionOjos > 4 );		
		
		
		int opcionNariz;
		do {
			System.out.println("1 - @   J   @");
			System.out.println("2 - {   \"   }");
			System.out.println("3 - [   j   ]");
			System.out.println("4 - <   -   >");
			System.out.println("Introduce el numero de la opcion elegida (1-4)");
			opcionNariz=sc.nextInt();
			if (opcionNariz < 1 || opcionNariz > 4 )
				System.out.println("La opcion elegida no es correcta. Vuelve a introducir otra opcion correcta");
		}while(opcionNariz < 1 || opcionNariz > 4 );	
		
		int opcionBoca;
		do {
			System.out.println("1 - |  ===  |");
			System.out.println("2 - |   -   |");
			System.out.println("3 - |  ___  |");
			System.out.println("4 - |  ---  |");
			System.out.println("Introduce el numero de la opcion elegida (1-4)");
			opcionBoca=sc.nextInt();
			if (opcionBoca < 1 || opcionBoca > 4 )
				System.out.println("La opcion elegida no es correcta. Vuelve a introducir otra opcion correcta");
		}while(opcionBoca < 1 || opcionBoca > 4 );	
		
		
		
		switch (opcionPelo) {
		case 1: 
			System.out.println("WWWWWWWWW");
			break;
		case 2: 
			System.out.println("\\\\\\//////");
			break;
		case 3: 
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		case 4: 
			System.out.println("|||||||||");
			
		}
		
		switch (opcionOjos) {
		case 1: 
			System.out.println("|  O O  |");
			break;
		case 2: 
			System.out.println("|-(· ·)-|");
			break;
		case 3: 
			System.out.println("|-(o o)-|");
			break;
		case 4: 
			System.out.println("| \\  /  |");
			
		}
		
		switch (opcionNariz) {
		case 1: 
			System.out.println("@   J   @");
			break;
		case 2: 
			System.out.println("{   \"   }");
			break;
		case 3: 
			System.out.println("[   j   ]");
			break;
		case 4: 
			System.out.println("<   -   >");
			
		}
		
		switch (opcionBoca) {
		case 1: 
			System.out.println("|  ===  |");
			break;
		case 2: 
			System.out.println("|   -   |");
			break;
		case 3: 
			System.out.println("|  ___  |");
			break;
		case 4: 
			System.out.println("|  ---  |");			
		}
		
		
		System.out.println(" \\_____/ ");
	}

}
