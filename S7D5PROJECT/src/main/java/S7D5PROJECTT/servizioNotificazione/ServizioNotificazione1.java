package S7D5PROJECTT.servizioNotificazione;

public class ServizioNotificazione1 implements ServizioNotificazione {

	@Override
	public void inviaAllarme(String urlAllarme) {
		System.out.println("Invio notifica:" + urlAllarme);
	}

}
