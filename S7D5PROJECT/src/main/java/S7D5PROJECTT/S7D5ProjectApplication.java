package S7D5PROJECTT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import S7D5PROJECTT.rilevatoreIncendio.RilevatoreIncendio;
import S7D5PROJECTT.rilevatoreIncendio.RilevatoreIncendioFactory;
import S7D5PROJECTT.servizioNotificazione.ServizioNotificazione1;

@SpringBootApplication
public class S7D5ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(S7D5ProjectApplication.class, args);

		ServizioNotificazione1 servizioNotificazione = new ServizioNotificazione1();

		RilevatoreIncendio rilevatore1 = RilevatoreIncendioFactory.creaRilevatore("JG39FJ546O", 41.90225040449073,
				34.501298640879941, 7, servizioNotificazione);

		RilevatoreIncendio rilevatore2 = RilevatoreIncendioFactory.creaRilevatore("4849FJNV4", 411.34302250404490,
				43.504297648870031, 9, servizioNotificazione);

		RilevatoreIncendio rilevatore3 = RilevatoreIncendioFactory.creaRilevatore("4849FJNV4", 411.34302250404490,
				43.504297648870031, 5, servizioNotificazione);

		rilevatore1.rilevaIncendio();
		rilevatore2.rilevaIncendio();
		rilevatore3.rilevaIncendio();

	}
}
