package messagerie;
import java.util.Date;

/**
 * utilisation du t�l�phone par l'abonn�
 */

public class Telephone implements GestionCommunication
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
	// m�thodes propres
	//------------------------------------------------------------------------

	public void allumer() {
		// TODO
	}
	public void eteindre() {
		// TODO
	}

} // Telephone