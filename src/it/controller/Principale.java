package it.controller;

import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {

		try (Scanner seleziona = new Scanner(System.in)) {
			ListaSeleziona listaPrincipale = new ListaSeleziona();

			listaPrincipale.listaPrincipale();

			try {

				if (seleziona.hasNext()) {

					int opzioneScelta = seleziona.nextInt();

					if (opzioneScelta >= 1 && opzioneScelta <= 7) {

						switch (opzioneScelta) {

						case 1:
							System.out.println("case1");
							Principale.main(args);
						case 2:
							System.out.println("case2");
							Principale.main(args);
						case 3:
							System.out.println("case3");
							Principale.main(args);
						case 4:
							System.out.println("case4");
							Principale.main(args);
						case 5:
							System.out.println("case5");
							Principale.main(args);
						case 6:
							System.out.println("case6");
							Principale.main(args);
						case 7:
							System.out.println("case7");
							Principale.main(args);
						}

					}else {
						System.out.println("Inserisci un numero della lista");
						Principale.main(args);
					}

				}

			} catch (Exception e) {
				System.out.println("Input non valido. Inserisci un numero.");
				Principale.main(args);
			}
		}

	}

}