package S7D5PROJECTT.servizioNotificazione;

import S7D5PROJECTT.rilevatoreIncendio.RilevatoreIncendio;
import S7D5PROJECTT.rilevatoreIncendio.RilevatoreIncendio1;
import S7D5PROJECTT.rilevatoreIncendio.RilevatoreIncendioDecorator;

public class ServizioNotificazioneDecorator extends RilevatoreIncendioDecorator {

	private ServizioNotificazione servizioNotificazione;

	public ServizioNotificazione getServizioNotificazione() {
		return servizioNotificazione;
	}

	public void setServizioNotificazione(ServizioNotificazione servizioNotificazione) {
		this.servizioNotificazione = servizioNotificazione;
	}

	public ServizioNotificazioneDecorator(RilevatoreIncendio rilevatoreDecorator,
			ServizioNotificazione servizioNotificazione) {
		super(rilevatoreDecorator);
		setServizioNotificazione(servizioNotificazione);
	}

	public String creaUrlAllarme() {
		String idSonda = ((RilevatoreIncendio1) rilevatore).getIdSonda();
		double latitudine = ((RilevatoreIncendio1) rilevatore).getLatitudine();
		double longitudine = ((RilevatoreIncendio1) rilevatore).getLongitudine();
		int livelloFumo = ((RilevatoreIncendio1) rilevatore).getLivelloFumo();
		return "http://host/alarm?idSonda=" + idSonda + "&lat=" + latitudine + "&lon=" + longitudine + "&livelloFumo="
				+ livelloFumo;
	}

	@Override
	public void rilevaIncendio() {
		if (((RilevatoreIncendio1) rilevatore).getLivelloFumo() > 5) {
			rilevatore.rilevaIncendio();
			String allarmeUrl = creaUrlAllarme();
			servizioNotificazione.inviaAllarme(allarmeUrl);
		}
	}

}
