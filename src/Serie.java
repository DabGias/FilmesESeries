
public class Serie extends MidiaVisual {
	private int temps;

	public Serie(String titulo, int ano, String sinopse, int temps) {
		super(titulo, ano, sinopse);
		this.temps = temps;
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}
	
	@Override
	public String toString() {
		if (this.assistido == true) {
			return "\n" + this.titulo + ": \n" + this.sinopse + "\nTemporadas: " + this.temps + "\nAno" + this.ano + "\nNota: " + this.nota + "\nAssistido: Sim";
		} else {
			return "\n" + this.titulo + ": \n" + this.sinopse + "\nTemporadas: " + this.temps + "\nAno" + this.ano + "\nNota: " + this.nota + "\nAssistido: Não";
		}
	}
}
