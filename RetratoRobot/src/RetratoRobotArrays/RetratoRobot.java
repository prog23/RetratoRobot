package RetratoRobotArrays;

import java.util.Scanner;

public class RetratoRobot {
	static Scanner in= new Scanner (System.in);
	static String [][] rasgos = {
			{"WWWWWWWWW" , "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
			{"|  O O  |","|-(· ·)-|", "|-(o o)-|","| \\  /  |"},
			{"1 - @   J   @", "{   \"   }","[   j   ]","<   -   >"},
			{"|  ===  |","|   -   |","|  ___  |","|  ---  |"},
			{" \\_____/ "," \\,,,,,,,/"}
};

	static String getOpcion (int rasgo, String nombre) {
		int opcion;
		for (int i = 0; i < rasgos[rasgo].length; i++) 
			System.out.println(rasgos[rasgo][i]);
		
		do {
			System.out.println("Introduce el numero de la opcion elegida "+nombre+"(1- " + rasgos);
			opcion = in.nextInt();
			if (opcion < 1 || opcion > rasgos[rasgo].length) {
				System.out.println("La opción no es correcta. Vuelve a elegir otra opcion");
			}
		}while(opcion < 1 || opcion > rasgos[rasgo].length);
		return rasgos[rasgo][opcion];
	}
	static void main (String[] args) {
		String []nombre= {"pelo", "ojos", "nariz", "boca", "barbilla"};
		String []retrato = new String [5];
		for (int i = 0; i<retrato.length;i++)
			retrato[i] = getOpcion(i, nombre[i]);
		for (int i = 0; i < retrato.length; i++)
			System.out.println(retrato[i]);
				}

	}
			
	




