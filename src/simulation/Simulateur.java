package simulation;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import messagerie.Operateur;
import messagerie.Telephone;

public class Simulateur
{
	@SuppressWarnings("deprecation")
	public static void main(String [ ] args)
	{
		// les noms
		String [] noms = {
				"Samuel",	// +33(0)700000001
				"S�bastien",	//		 2
				"Aur�lie",	//		 3
				"L�a",		//		 4
				"Pierre",	//		 5
				"G�raldine",	//		 6
				"Bastien", 	//		 7
				"Claude", 	//		 8
		};

		// cr�er un op�rateur
		Operateur breizhtel = new Operateur("BreizhTel");
		String [] lesForfaits = { "illimite", "1h", "acte",  };
		// SDD pour m�moriser les t�l�phones
		Map<String, Telephone> lesTelephones = new TreeMap<String, Telephone>();
		// g�n�rateur de nombres al�atoires
		Random generateurAleatoire = new Random();
		// souscrire quelques abonnements
		for (int i = 0; i < noms.length; ++i) {
			try {
				Telephone newtel =
						breizhtel.souscrire(noms[i],
								lesForfaits[generateurAleatoire.nextInt(lesForfaits.length)]);
				lesTelephones.put(noms[i], newtel);
			}
			catch (Exception e) {
				e.printStackTrace();
				System.err.println("*** Erreur : impossible d'abonner " + noms[i]);
			}
		}
		afficher("�tat initial", breizhtel);

		// ------------------------------------------------------------------------
		//			� COMPL�TER
		// ------------------------------------------------------------------------
		lesTelephones.get("Samuel").allumer();
		lesTelephones.get("Samuel").appeler("+33(0)700000004", "O� c'est qu't'es ?", new Date(2012, 12, 13, 15, 45, 10));
		lesTelephones.get("Samuel").envoyerSMS("+33(0)700000004", "L�a, r�ponds, nom d'une pipe !", new Date(2012, 12, 13, 15, 45, 10));
		lesTelephones.get("Samuel").envoyerSMS("+33(0)700000004", "L�a, alleeez, sois pas vache !", new Date(2012, 12, 13, 15, 46, 0));
		lesTelephones.get("Samuel").envoyerSMS("+33(0)700000004", "L�a, je plaisantais !!!!!!!!!!", new Date(2012, 12, 13, 15, 46, 10));
		lesTelephones.get("L�a").allumer();
		System.out.println("\n�tat de L�a: " + lesTelephones.get("L�a"));
		lesTelephones.get("Samuel").appeler("+33(0)700000004", "O� c'est qu't'es ?", new Date(2012, 12, 13, 15, 47, 5));
		afficher("�tat 1", breizhtel);

		// ------------------------------------------------------------------------
		//			FACTURATION : � FAIRE
		// ------------------------------------------------------------------------

	}

	// afficher l'�tat de la simulation
	static void afficher(String msg, Operateur op)
	{
		System.out.println(msg + "\n---------------------\n" + op + "---------------------\n");
	}
} // Simulateur