
public class Filme extends MidiaVisual {

	public Filme(String titulo, int ano, String sinopse) {
		super(titulo, ano, sinopse);
	}
	
	@Override
	public String toString() {
		if (this.assistido == true) {
			return this.titulo + ": \n" + this.sinopse + "\nAno: " + this.ano + "\nNota: " + this.nota + "\nAssistido: Sim";
		} else {
			return "\n" + this.titulo + ": \n" + this.sinopse + "\nAno: " + this.ano + "\nNota: " + this.nota + "\nAssistido: Não";
		}
	}
}
