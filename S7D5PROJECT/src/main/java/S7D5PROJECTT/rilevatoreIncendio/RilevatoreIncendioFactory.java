package S7D5PROJECTT.rilevatoreIncendio;

import S7D5PROJECTT.servizioNotificazione.ServizioNotificazione;
import S7D5PROJECTT.servizioNotificazione.ServizioNotificazioneDecorator;

public class RilevatoreIncendioFactory {

	public static RilevatoreIncendio creaRilevatore(String idSonda, double latitudine, double longitudine,
			int livelloFumo, ServizioNotificazione servizioNotificazione) {

		RilevatoreIncendio rilevatore = new RilevatoreIncendio1(idSonda, latitudine, longitudine, livelloFumo,
				servizioNotificazione);

		return new ServizioNotificazioneDecorator(rilevatore, servizioNotificazione);
	}
}
