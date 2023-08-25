package S7D5PROJECTT.rilevatoreIncendio;

import S7D5PROJECTT.servizioNotificazione.ServizioNotificazione;

public class RilevatoreIncendio1 implements RilevatoreIncendio {

	private String idSonda;
	private double latitudine;
	private double longitudine;
	private int livelloFumo;
	private ServizioNotificazione servizioNotificazione;

	public void setIdSonda(String idSonda) {
		this.idSonda = idSonda;
	}

	public String getIdSonda() {
		return idSonda;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public int getLivelloFumo() {
		return livelloFumo;
	}

	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}

	public void setServizioNotificazione(ServizioNotificazione servizioNotificazione) {
		this.servizioNotificazione = servizioNotificazione;
	}

	public ServizioNotificazione getServizioNotificazione() {
		return servizioNotificazione;
	}

	public RilevatoreIncendio1(String idSonda, double latitudine, double longitudine, int livelloFumo,
			ServizioNotificazione servizioNotificazione) {
		setIdSonda(idSonda);
		setLatitudine(latitudine);
		setLongitudine(longitudine);
		setLivelloFumo(livelloFumo);
		setServizioNotificazione(servizioNotificazione);
	}

	@Override
	public void rilevaIncendio() {

		if (livelloFumo > 5) {
			this.toString();
		}

	}
}
