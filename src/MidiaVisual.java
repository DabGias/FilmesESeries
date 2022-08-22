
public abstract class MidiaVisual {
	String titulo;
	int ano;
	String sinopse;
	double nota;
	boolean assistido;
	
	public MidiaVisual(String titulo, int ano, String sinopse) {
		this.titulo = titulo;
		this.ano = ano;
		this.sinopse = sinopse;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota <= 5 && nota >= 0) this.nota = nota;
	}

	public boolean isAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}
	
}
