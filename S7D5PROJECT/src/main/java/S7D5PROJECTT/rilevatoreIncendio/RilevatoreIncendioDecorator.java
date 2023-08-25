package S7D5PROJECTT.rilevatoreIncendio;

public abstract class RilevatoreIncendioDecorator implements RilevatoreIncendio {

	protected RilevatoreIncendio rilevatore;

	public RilevatoreIncendioDecorator(RilevatoreIncendio rilevatore) {
		this.rilevatore = rilevatore;
	}

}
