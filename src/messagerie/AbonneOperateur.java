package messagerie;
import java.util.Date;

/**
 * Informations d'Abonn� g�r�es par l'op�rateur
 */
public class AbonneOperateur implements GestionCommunication
{

	//------------------------------------------------------------------------
	// m�thodes de l'interface GestionCommunication
	//------------------------------------------------------------------------

	@Override
	public boolean appeler(String numero, String msgVocalSiOccupe, Date dateDebut)
	{
		// TODO
		return false;
	}
	@Override
	public void envoyerSMS(String numero, String sms, Date dateSMS)
	{
		// TODO
	}
	@Override
	public void recevoirSMS(MessageSMS message)
	{
		// TODO
	}
	@Override
	public boolean accepterAppel(String numeroAppelant)
	{
		// TODO
		return false;
	}
	@Override
	public void cloreAppel(Date fin)
	{
		// TODO
	}

	//------------------------------------------------------------------------
	// autres m�thodes
	//------------------------------------------------------------------------

	// transf�rer sur le t�l�phone les SMS du serveur
	public void synchroniser()
	{
		// TODO
	}

	boolean estHorsLigne()
	{
		// TODO
		return true;
	}

	boolean estLibre()
	{
		// TODO
		return true;
	}

} // AbonneOperateur