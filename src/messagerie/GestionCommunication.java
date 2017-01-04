package messagerie;
import java.util.Date;

/**
   Sp�cification des op�rations de communication
 */
public interface GestionCommunication
{
	// op�rations effectu�es par le t�l�phone appelant
	public boolean appeler   (String numero, String msgVocalSiOccupe, Date dateDebut);
	public void    envoyerSMS(String numero, String sms, Date dateSMS);
	// op�rations effectu�es par le t�l�phone appel�
	public boolean accepterAppel(String numeroAppelant);
	public void    recevoirSMS  (MessageSMS message);
	// op�ration effectu�e indif�remment par l'appelant ou l'appel�
	public void    cloreAppel(Date fin);
} // GestionCommunication