package messagerie;
import java.util.Date;

/**
 * Un Op�rateur g�re des abonn�s et des communications
 */
public class Operateur
{

	/**
	 * Une personne souscrit un abonnement et re�oit un t�l�phone
	 */
	public Telephone souscrire(String nomPersonne,
			String nomForfait)
	{
		// TODO
		return null;
	}

	/**
	 * �tablir une communication
	 * @param emetteur
	 * @param numeroDestinataire
	 * @param msgVocal : message en cas d'indisponibilit�
	 * @param dateAppel
	 * @return vrai si la communication a �t� �tablie
	 */
	public boolean
	etablirCommunication(AbonneOperateur emetteur, 
			String numeroDestinataire,
			String msgVocal,
			Date dateAppel)
	{
		// TODO
		return false;
	}

	/**
	 * poster un SMS
	 * @param emetteur
	 * @param numeroDestinataire
	 * @param sms : le texte du SMS
	 * @pamra dateEnvoi
	 */
	public void
	posterSMS(AbonneOperateur emetteur,
			String numeroDestinataire,
			String sms,
			Date dateEnvoi)
	{
		// TODO
	}

	/**
	 * un abonn� met fin � une communication
	 * @param abonne : celui qui cl�t
	 * @param date de fin de communication
	 */
	public void cloreAppel(AbonneOperateur abonne, Date fin)
	{
		// TODO
	}

} // Operateur